
public class Primos {
static int fatorial (int numero) {
   int resultado = numero;
   if (numero == 0) resultado++;
   while (numero > 1) resultado *= --numero;
   return resultado;
};
    
static void primos (int fim){
int inicio, i, divisor,quociente,resto,j;
j=0;
inicio=1;
divisor=3;
System.out.println("Esses sãos os numeros primos"); 
for(i=inicio;i<=fim;i+=2)
{
divisor=3;
do
{
quociente=i/divisor;
resto=i%divisor;
divisor+=2;
}while(resto>0 && quociente>divisor);
if(resto>0)
	System.out.println(i); 
	j++;
	if(i==1){
	System.out.println("3");
	}
}
/*
System.out.println("\nEsse sao os numeros primos multiplicados\n");
i=0;
inicio=3;
divisor=3;
int resultado,resultado_aux = 0;
int aux=1;
for(i=inicio;i<=fim;i+=2)
{
divisor=3;
do
{
quociente=i/divisor;
resto=i%divisor;
divisor+=2;
}while(resto>0 && quociente>divisor);
if(resto>0){
aux++;
resultado=i;
resultado=resultado*aux;
resultado_aux+=resultado;
System.out.println(resultado); 
}
}
System.out.println("\nResultado da soma "+resultado_aux); */
};

public static void main(String[] args){
int numero2, numero3;
numero2=4;
numero3=fatorial(numero2);
System.out.println("O fatorial do numero eh:" +numero3+"\n");
primos(numero3);
}
}

