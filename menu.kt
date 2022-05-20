class menu:fitnessData(){
    var choice=0
    var choiceS=""
    var dataObj=fitnessData()
    //BMI calculator
    fun BMIcalculator(){
        println("Enter weight in kg")
        dataObj.Weight=Integer.valueOf(readLine())
        println("Enter hight in m")
        dataObj.Hight=Integer.valueOf(readLine())
        var sq=(dataObj.Hight)*(dataObj.Hight)
        dataObj.BMI=dataObj.Weight/sq
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
            println("--------------enter fitness data--------------\n| HR. Heart rate      BP. Blood Pressure     |\n| BMI. BMI            PHY. Physical Activity |\n\nEXIT.\n\n--> ")
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
        println("\n-----------------------------------------------")
        println("| Heart Rate is "+ dataObj.HeartRate)
        println("| Blood Pressure is "+ dataObj.BloodPressure)
        println("| BMI is "+ dataObj.BMI)
        println("| physical activity done is "+ dataObj.PhysicalActivity)
        println("-----------------------------------------------")
    }
}