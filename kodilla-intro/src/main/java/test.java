 public class test {
    String name;
    double age;
    double height;
    public test(String name,double age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
        }
        public String getName() {
            return name;
        }
        public double getAge(){
        return age;
        }
        public double getHeight(){
        return height;
        }
        public boolean name(String name) {
            if (name != null) {
                return true;
            } else {
                return false;
            }
        }
        public boolean age(double age) {
            if (age > 30) {
                return true;
            } else {
                return false;
            }
        }
        public boolean height(double height) {
            if (height > 160) {
                return true;
            } else {
                return false;
            }
        }
        
     }



}