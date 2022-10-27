package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherAlertTestSuite {
    WeatherAlert alertService = new WeatherAlert();
    Alert alert = Mockito.mock(Alert.class);
    Person client = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void notSubscribedClientShouldNotReceiveAlert() {
        //when
        alertService.sendAlertToGroup(alert);
        //then
        Mockito.verify(client, Mockito.never()).receive(alert);
    }

    @Test
    public void clientSubscribedToOneLocationShouldReceiveOneAlertToLocation() {
        //when
        alertService.addDataToTheMap(location, client);
        alertService.sendAlertToLocation(alert, location);
        //then
        Mockito.verify(client, Mockito.times(1)).receive(alert);
    }

    @Test
    public void clientSubscribedTwiceToSameLocationShouldReceiveOneAlert() {
        //when
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location, client);
        alertService.sendAlertToLocation(alert, location);
        //then
        Mockito.verify(client, Mockito.times(1)).receive(alert);
    }

    @Test
    public void clientSubscribedToMoreLocationsShouldReceiveAlertToEachLocation() {
        //given
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        //when
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location1, client);
        alertService.addDataToTheMap(location2, client);
        alertService.sendAlertToLocation(alert, location);
        alertService.sendAlertToLocation(alert, location1);
        alertService.sendAlertToLocation(alert, location2);
        //then
        Mockito.verify(client, Mockito.times(3)).receive(alert);
    }

    @Test
    public void clientsSubscribedToOneLocationShouldReceiveAlertToLocation() {
        //given
        Person client1 = Mockito.mock(Person.class);
        Person client2 = Mockito.mock(Person.class);
        //when
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location, client1);
        alertService.addDataToTheMap(location, client2);
        alertService.sendAlertToLocation(alert, location);
        //then
        Mockito.verify(client, Mockito.times(1)).receive(alert);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.times(1)).receive(alert);
    }

    @Test
    public void clientsSubscribedToMoreLocationsShouldReceiveAlertsToLocations() {
        //given
        Person client1 = Mockito.mock(Person.class);
        Person client2 = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        //when
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location, client1);
        alertService.addDataToTheMap(location1, client1);
        alertService.addDataToTheMap(location, client2);
        alertService.addDataToTheMap(location2, client2);
        alertService.sendAlertToLocation(alert, location);
        alertService.sendAlertToLocation(alert, location1);
        alertService.sendAlertToLocation(alert, location2);
        //then
        Mockito.verify(client, Mockito.times(1)).receive(alert);
        Mockito.verify(client1, Mockito.times(2)).receive(alert);
        Mockito.verify(client2, Mockito.times(2)).receive(alert);
    }

    @Test
    public void clientsShouldReceiveGroupAlerts() {
        //given
        Person client1 = Mockito.mock(Person.class);
        Person client2 = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        //when
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location, client1);
        alertService.addDataToTheMap(location1, client1);
        alertService.addDataToTheMap(location, client2);
        alertService.addDataToTheMap(location2, client2);
        alertService.sendAlertToGroup(alert);
        //then
        Mockito.verify(client, Mockito.times(1)).receive(alert);
        Mockito.verify(client1, Mockito.times(2)).receive(alert);
        Mockito.verify(client2, Mockito.times(2)).receive(alert);
    }

    @Test
    public void clientShouldBeAbleToCancelSubscriptionFromLocation() {
        //given
        Location location1 = Mockito.mock(Location.class);
        //when
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location1, client);
        alertService.removeSubscription(location1, client);
        alertService.sendAlertToLocation(alert, location);
        alertService.sendAlertToLocation(alert, location1);
        //then
        Mockito.verify(client, Mockito.times(1)).receive(alert);
    }

    @Test
    public void clientShouldBeAbleToCancelSubscriptionsAndStopReceivingNotifications() {
        //given
        Location location1 = Mockito.mock(Location.class);
        //when
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location1, client);
        alertService.removeAllSubscriptions(client);
        alertService.sendAlertToLocation(alert, location);
        alertService.sendAlertToLocation(alert, location1);
        //then
        Mockito.verify(client, Mockito.never()).receive(alert);
    }

    @Test
    public void shouldBePossibleToDeleteLocation(){
        //when
        alertService.addDataToTheMap(location, client);
        alertService.removeLocation(location);
        alertService.sendAlertToLocation(alert, location);
        //then
        Mockito.verify(client, Mockito.never()).receive(alert);
    }
}

