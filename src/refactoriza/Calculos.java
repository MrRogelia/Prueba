package refactoriza;

import static refactoriza.Refactoriza.mostrar;

public class Calculos {
    
static double funcion1()
    {
    double resu;
    resu = 3.1415 + 3.1415;
    return resu;
    }

static int funcion2(int num1)
    {
    if (num1 < 0)
        for (int i = 0; i < 5; i++)
        num1 = num1 - i;
    else if (num1 == 0 || num1 == 1 || num1 == 2 || num1 == 3 || num1 == 4)
        for (int i = 0; i < 5; i++)
        num1 = num1 - i;
    else if (num1 == 5 || num1 == 6 || num1 == 7)
        for (int i = 0; i < 5; i++)
        num1 = num1 - i;
    else
        num1 = num1 * 2;
    return num1;
    }

static void funcion3(double resultado){
    double pi=3.1415;
    for(int i=2; i<5;i++){
        resultado = (pi * i - 1) / pi;
        mostrar(resultado);
}
}

}
