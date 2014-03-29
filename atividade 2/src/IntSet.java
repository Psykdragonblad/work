//package DataStructures;

//import Util.Console;

public class IntSet extends EmptySetException {
	
	private int [ ] els;
	private int size;
	private int capacity=10;
	
	// Construtores
	public IntSet() {
	
	els=new int[capacity];
	size=0;
	
	}
	
	// Metodos
	
	public void insert (int x) {
		
		if (indexOf(x)>=0) return;	// Retorna se elemento j√° existir
		increaseCapacityIfNecessary();
		els[size]=x;
		size++;
	}
	
	
	private void increaseCapacityIfNecessary() {
		if (size==capacity) {
			int [ ] newarray=new int[capacity*2];
			for(int i=0;i<size;i++)
				newarray[i]=els[i];
			els=newarray;
			capacity*=2;
		}
	}
	
	public void remove (int x) throws IndexOutOfBoundsException {
		int index=indexOf(x);
		if(index>=0) removeElementAt(index);
	}
	
	// N√o entendi porque, mas fui obrigado a incluir a clausula throws !
	private void removeElementAt (int index) throws IndexOutOfBoundsException {
		if (index<0 || index>size-1)
			throw new IndexOutOfBoundsException("IntSet.removeElementAt");
		else
			size--;
			for (int i=index;i<size;i++)
				els[i]=els[i+1];
	}
	
	private int indexOf(int x) {
		for (int i=0;i<size;i++)
			if (x==els[i])
				return i;
			return -1;
	}
	
	public boolean isIn(int x) {
		// Efeito: se x pertence a this retorna verdadeiro caso contrario retorna falso
		return (indexOf(x)>=0);
	}
	
	public void ordena(){
		boolean troca;		
		int aux;
		do
		{
			troca = false;
			for(int i=0; i<size-1;i++){							
				if(els[i] > els[i+1]){					
					aux=els[i+1];
					els[i+1]=els[i];
					els[i]=aux;
					troca = true;
				}
			}
		}
		while(troca);
		//return this;
	}
	
	public void chamaquicksort(){
		quick_sort(els, 0, size);
		
	}
	
	 public void quick_sort(int []v,int ini, int fim) {
		 els=v;
		 size=fim;
         int meio;

         if (ini < fim) {
                 meio = partition(v, ini, fim);
                 quick_sort(v, ini, meio);
                 quick_sort(v, meio + 1, fim);
         }
 }

 public int partition(int []v, int ini, int fim) {
         int pivo, topo, i;
         pivo = v[ini];
         topo = ini;

         for (i = ini + 1; i <= fim; i++) {
                 if (v[i] < pivo) {
                         v[topo] = v[i];
                         v[i] = v[topo + 1];
                         topo++; 
                 }
         }
         v[topo] = pivo;
         return topo;
 }
 

	public void primos(){		
			int inicio, i, divisor,quociente,resto,j,fim;
			j=0;
			inicio=1;
			divisor=3;
			fim=29;
			//System.out.println("Esses s„os os numeros primos"); 
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
				System.out.println(i); 
				j=j+1;
				insert(i);
			}
			if(i==1){
				//System.out.println("3");
				j=j+1;
				insert(3);
			}
		}	
	}
	
	public int size() {
	// Efeito: retorna a cardinalidade de this
	return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public IntSet intersection(IntSet x) throws IndexOutOfBoundsException{
		
		int i=size-1;
		while(i>=0) {
			if (! x.isIn(els[i]))
				remove(els[i]);
			i--;
		}
		return this;
	}
	
	public void union(IntSet x, IntSet y) {
		
		int sizeofnewarray=x.size;
		for(int i=0;i<sizeofnewarray;i++)
			insert(x.els[i]);
		
		sizeofnewarray=y.size;
		for(int i=0;i<sizeofnewarray;i++)
			insert(y.els[i]);
		//return this;
	}
	
	public IntSet difference(IntSet x) throws IndexOutOfBoundsException{
		
		int sizeofnewarray=x.size;
		for(int i=0;i<sizeofnewarray;i++)
			if (isIn(x.els[i])) remove(x.els[i]);
		return this;
	}
	
	public void print() {
		System.out.print("[ ");
		for(int i=0;i<size;i++)
			System.out.print(els[i]+" ");
		System.out.print("]");
		return;
	}

	
	public int choose() throws EmptySetException {
	
	float r;
	int elem;
	if (size == 0) throw new EmptySetException("IntSet.Choose");
	
	r= (float) Math.random() * size;
	elem= (int) r;

	return els[elem];
	
	}
}