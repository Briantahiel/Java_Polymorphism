public abstract class User {
        private String name;
        private String id;
        private double salary;
        private int type;
        
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
        public abstract double getBono();
        // public double getBono(){
            // If type = 1 is manager. If type 0 is user;
            // return this.salary * 0.1;
            // if(this.type == 0){
            //     return this.salary * 0.1 + this.salary;
            // }
            // else if(type == 1){
            //     return this.salary;
            // }
            // else{
            //     return 0;
            // }
        // }
            public int getType(){
                return type;
            }
            public void setType(int type){
                this.type = type;
            }
}
