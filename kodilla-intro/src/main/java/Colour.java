public class Colour {
 public String colour() {
  String userSelected = UserDiColour.getUserSelection();
  String a = UserDiColour.getUserSelection();
  String b = UserDiColour.getUserSelection();
  switch (userSelected) {
   case "A":return "Amarant";
   case "B":return "Biały";
   case "C":return "Czerwony";
   case "D":return "Darmowy";
   default:return "wrong letter";
  }
 }
}