package metodos.entities;

public class Funcionario {
   private  double grossSalary; // salário bruto
   private  double tax;         // imposto

    public Double netSalary() {
        return grossSalary - tax;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setTax(double tax){
        this.tax = tax;
    }


    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }
}