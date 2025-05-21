public class teste implements Comparable<Conta>{

    private List<Conta> conta;


    public teste(){
        conta = new ArrayList<Conta>();
    }

    @Override
    public int copareTo(Conta o){
        if(this.numero > o.numero){
            return 1;
        }
        if(this.numer < o.numero){
            return -1;
        }
        return 0;
    }
}

import java.util.Comparator;
public class teste implements Comparator<Conta>{
    @Override
    public int compare(Conta o1, Conta o2){
        return o1.getTitular().compareTo(o2.getTitular());
    }
}