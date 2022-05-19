class credentials{
    internal var userName="RockyBhai"
    internal var password="RockyRocky"
}

open class fitnessData{
    internal var HeartRate=0
    internal var BloodPressure=0
    internal var BMI=0
    internal var PhysicalActivity="No Data"
    internal var Hight=0
    internal var Weight=0
}

class Menu:fitnessData(){
    var choice=0
    var choiceS=""
    var dataObj=fitnessData()
    //BMI calculator
    fun BMIcalculator(){
        println("Enter weight in kg")
        dataObj.Weight=Integer.valueOf(readLine())
        println("Enter hight in cm")
        dataObj.Hight=Integer.valueOf(readLine())
        dataObj.BMI=dataObj.Weight/((dataObj.Hight)*(dataObj.Hight))
    }
    //main menu
    fun mainMenu(){
        println("\n---main---\n1. enter data\n2. view data\n--> ")
        choice=Integer.valueOf(readLine())
        when (choice){
            1 -> enterMenu()
            2 -> viewMenu()
        }
    }
    //enter data menu
    fun enterMenu(){
        for (i in 0..20){
            println("--enter fitness data--\nHR. Heart rate\nBP. Blood Pressure\nBMI. BMI\nPHY. Physical Activity\nEXIT\n--> ")
            choiceS=readLine().toString()
            when (choiceS){
                "HR" -> dataObj.HeartRate=Integer.valueOf(readLine())
                "BP" -> dataObj.BloodPressure=Integer.valueOf(readLine())
                "BMI" -> BMIcalculator()
                "PHY" -> dataObj.PhysicalActivity=readLine().toString()
                "EXIT" -> break
            }
        }
    }
    //view data menu
    fun viewMenu(){
        println("Heart Rate is "+ dataObj.HeartRate)
        println("Blood Pressure is "+ dataObj.BloodPressure)
        println("BMI is "+ dataObj.BMI)
        println("physical activity done is "+ dataObj.PhysicalActivity)
    }
}

fun main(){

    var menuObj=Menu()

    print("""\

               ._ o o
               \_`-)|_
            ,""       \ 
          ,"  ## |   ಠ ಠ. 
        ," ##   ,-\__    `.
      ,"       /     `--._;)
    ,"     ## /
  ,"   ##    /

gIRAFFE fITNESS
                    """)
    var userName=" "
    var password=" "
    println("\n---LOGIN---")
    println("User Name -")
    userName=readLine().toString()
    println("Password -")
    password=readLine().toString()
    if(userName==credentials().userName && password==credentials().password){
        for (i in 0..20){
            menuObj.mainMenu()
        }
    }else{
        println("Login Failed")
    }
}
