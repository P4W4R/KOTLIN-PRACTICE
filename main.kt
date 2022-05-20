fun main(){

    var menuObj=menu()

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