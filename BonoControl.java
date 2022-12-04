public class BonoControl {
    private double sum;
    public void registerSalary(User user){
        this.sum = user.getBono() + this.sum;
        System.out.println("Total: " +  this.sum);

    }
    public double getSum(){
        return this.sum;
    }
}
