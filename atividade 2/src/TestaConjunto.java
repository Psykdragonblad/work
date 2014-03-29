//package DataStructures;
//import Util.Console;

public class TestaConjunto  {

    public static void main(String[] args) throws IndexOutOfBoundsException {
        int opcaoMenu;
        IntSet setA,setB,setC,setD,setE;
        setA=new IntSet();
        setB=new IntSet();
        setC=setD=setE=null;
        int elem;
       	do {
           // limpa a tela e apresenta as opcoes do menu
           Console.clrscr();
           System.out.println("1-Inserir um Elemento no Conjunto A");
           System.out.println("2-Remover um Elemento do Conjunto A");
           System.out.println("3-Imprimir um Elemento Aleatorio do Conjunto A");
           System.out.println("4-Testar se um Elemento Pertence ao Conjunto A");
           System.out.println("5-Inserir um Elemento no Conjunto B");
           System.out.println("6-Remover um Elemento do Conjunto B");
           System.out.println("7-Criar um Conjunto C Resultado da Uniao de A com B");
           System.out.println("8-Criar um Conjunto D Resultado da Intersecao de A com B");
           System.out.println("9-Criar um Conjunto E Resultado da Diferenca entre A e B");
           System.out.println("10-Imprimir os Elementos do Conjunto A");
           System.out.println("11-Imprimir os Elementos do Conjunto B");
           System.out.println("12-Imprimir os Elementos do Conjunto C");
           System.out.println("13-Imprimir os Elementos do Conjunto D");
           System.out.println("14-Imprimir os Elementos do Conjunto E");
           System.out.println("15-Ordenar o conjunto A");
           System.out.println("16-Ordenar o conjunto B");
           System.out.println("17-Ordenar o conjunto C");
           System.out.println("18-Preencher o conjunto B");
           System.out.println("19-Ordena a quicksort A");
           System.out.println("20-Sair");
           opcaoMenu=Console.readInt("Selecione uma opcao do menu:");
           // testa as opcoes do menu
           switch (opcaoMenu) {
           	case 1:
                // Codigo para inserir um elemento no conjunto A
                Console.clrscr();
                elem=Console.readInt("Informe um inteiro para o Conjunto A");
                setA.insert(elem);
                setC=setD=setE=null;
           		break;
           	case 2:
                // Codigo para remover um elemento no conjunto A
                Console.clrscr();
                elem=Console.readInt("Informe o inteiro a ser removido do conjunto A");
                setA.remove(elem);
                setC=setD=setE=null;
           		break;
           	case 3:
                // Codigo para escolher um elemento aleatorio no conjunto A
 				try {
                	elem=setA.choose();
                	Console.clrscr();
                	System.out.println("O elemento "+elem+" pertence ao conjunto A");
 				}
				catch (EmptySetException ese) {
					System.out.println(ese);
				}
                Console.pause();
           		break;
           	case 4:
                // Codigo para testar se um elemento pertence ao conjunto A
                Console.clrscr();
                elem=Console.readInt("Informe um inteiro A e verifique se ele pertence ao conjunto A");
                if (setA.isIn(elem))
                	System.out.println("O elemento "+elem+" pertence ao conjunto A");
                else
                	System.out.println("O elemento "+elem+" nao pertence ao conjunto A");
                Console.pause();
           		break;
           	case 5:
                // Codigo para inserir um elemento no conjunto B
                Console.clrscr();
                elem=Console.readInt("Informe um inteiro para o Conjunto B");
                setB.insert(elem);
                setC=setD=setE=null;
           		break;
           	case 6:
                // Codigo para remover um elemento no conjunto B
                Console.clrscr();
                elem=Console.readInt("Informe o inteiro a ser removido do conjunto B");

                // N‹o entendi porque, mas fui obrigado a incluir a clausula throws na classe main() !
                setB.remove(elem);
                setC=setD=setE=null;
           		break;
           	case 7:
                // Cria um Conjunto C Resultado da Uniao de A com B
           		setC=new IntSet();
                setC.union(setB,setA);
                System.out.println("Conjunto C criado com sucesso");
                Console.pause();
           	    break;
           	case 8:
                // Cria um Conjunto D Resultado da Intersecao de A com B
                setD=setA.intersection(setB);
                System.out.println("Conjunto D criado com sucesso");
                Console.pause();
           	    break;
           	case 9:
                // Cria um Conjunto E Resultado da diferenca entre A e B
                setE=setA.difference(setB);
                System.out.println("Conjunto E criado com sucesso");
                Console.pause();
           	    break;
           	case 10:
                // Codigo para imprimir conjunto A
                if (setA.size()==0) {
                	System.out.println("O conjunto A esta vazio");
                }
                else {
					setA.print();
                }
                Console.pause();
           		break;
           	case 11:
                // Codigo para imprimir conjunto A
                if (setB.size()==0) {
                	System.out.println("O conjunto B esta vazio");
                }
                else {
					setB.print();
                }
                Console.pause();
           		break;
           	case 12:
                // Codigo para imprimir conjunto C
                if (setC==null) {
                	Console.clrscr();
                	System.out.println("Voce ainda nao criou o conjunto C ou os conjuntos A e/ou B foram modificados");
                }
                else {
                	if (setC.size()==0) {
	                	System.out.println("O conjunto C esta vazio");
                	}
                	else {
                		setC.print();
                	}
                }
                Console.pause();
           		break;
           	case 13:
                // Codigo para imprimir conjunto D
                if (setD==null) {
                	Console.clrscr();
                	System.out.println("Voce ainda nao criou o conjunto D ou os conjuntos A e/ou B foram modificados");
                }
                else {
                	if (setD.size()==0) {
	                	System.out.println("O conjunto D esta vazio");
                	}
                	else {
                		setD.print();
                	}
                }
                Console.pause();
           		break;
           	case 14:
                // Codigo para imprimir conjunto E
                if (setE==null) {
                	Console.clrscr();
                	System.out.println("Voce ainda nao criou o conjunto E ou os conjuntos A e/ou B foram modificados");
                }
                else {
                	if (setE.size()==0) {
	                	System.out.println("O conjunto E esta vazio");
                	}
                	else {
                		setE.print();
                	}
                }
                Console.pause();
           		break;
           		
           	case 15:
                // Ordenar o conjunto A
                setA.ordena();
           		break;
           	case 16:
                // Ordenar o conjunto A
                setB.ordena();
           		break;
           	case 17:
                // Ordenar o conjunto A
                setC.ordena();
           		break;
           	case 18:
                // Ordenar o conjunto A 
                setB.primos();
           		break;
           	case 19:
                // Ordenar o conjunto A 
                setA.chamaquicksort();
           		break;
           	case 20:
                // Sair do programa
                Console.clrscr();
  				return;
           default:
           	    Console.clrscr();
                System.out.println("Opcao Invalida\n");
                Console.pause();
                break;
           }
       } while(true);
    }
}