public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int bonus;
    int salaryIncrease;
    int fee;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax(){
        if(this.salary<1000){
            this.fee = salary;
        }else if(this.salary >=1000){
            this.fee = (salary)*3/100;
        }
        return this.fee;
    }

    int bonus(){
        if(this.workHours>=40){
            this.bonus = 30*(this.workHours-40);
        }
        return this.bonus;
    }
    int raiseSalary(){
        if(2021-this.hireYear <10){
            this.salaryIncrease = this.salary*5/100;
        }else if(2021-this.hireYear>=10 && 2021-this.hireYear<20){
            this.salaryIncrease = salary*10/100;
        }
        else if(2021-this.hireYear >=20){
            this.salaryIncrease = salary*15/100;

        }
        return this.salaryIncrease;
    }
    void employeeInformation(){
        System.out.println("İsim: "+this.name);
        System.out.println("Maaş: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("İşe başlama Yılı: "+this.hireYear);
        System.out.println("Vergi: "+this.tax());
        System.out.println("Bonus: " +this.bonus());
        System.out.println("Maaş Artışı: "+ this.raiseSalary());
        int i = this.salary+this.bonus() - this.tax();
        System.out.println("Vergi ve bonuslarla birlikte maaş: "+" " + i);
        int j = this.salary + this.raiseSalary();
        System.out.println("Toplam maaş: "+ j);


    }


}
