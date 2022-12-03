public class User {
        private String name;
        private String id;
        private double salary;
        
        // It accepts parameters to assign to the variables
        public User(){

        }
    
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getid(){
            return id;
        }
        public void setId(String id){
            this.id = id;
        }
        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary){
            this.salary = salary;
        }
}
