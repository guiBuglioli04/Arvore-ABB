public class ABBint {
    private class NO{
        int dado;
        NO esq,dir;
    }

    public NO root = null;

    public NO inserir(NO p,int info){
        if(p==null){
            p = new NO();
            p.dado = info;
            p.esq = null;
            p.dir = null;
        }
        else if(info < p.dado)
            p.esq = inserir(p.esq,info);
        else
            p.dir = inserir(p.dir,info);
        return p;
    }
    public void show(NO p){
        if(p!= null){
            show(p.esq);
            System.out.println(p.dado);
            show(p.dir);
        }
    }
    public int contaNos(NO p, int cont){
        if (p!=null){
            cont++;
            contaNos(p.esq,cont);
            cont = contaNos(p.esq , cont);
            cont = contaNos(p.dir,cont);
        }
        return cont;
    }
    public boolean consulta(NO p, int valor){
        if(p!=null){
            if(valor ==p.dado)
                return true;
            else if(valor<p.dado)
                return consulta(p.esq,valor);
            else
                return consulta(p.dir,valor);

        }else
            return false;
    }
    public int contaConsulta(NO p,int cont,int valor){
        if(p!=null){
            cont++;
            if(valor ==p.dado)
                return cont;
            else if(valor<p.dado){
                return contaConsulta(p.esq,valor,cont);}
            else{
                return contaConsulta(p.dir,valor,cont);}

        }else
            return cont;
    }
    public NO removeValor(NO p,int info){
            NO aux , ref;
        if(p!=null){
            if (info == p.dado){
                if (p.esq == null && p.dir == null)
                    return null;
                if(p.esq == null)
                    return p.dir;
            }else {
                ref=p.dir;
                aux=p.dir;
                while(aux.esq != null){
                    aux = aux.esq;
                }
                aux.esq=p.esq;
                return ref;
            }
        }else{
            if (info<p.dado)
                p.esq = removeValor(p.esq,info);
            else
                p.dir = removeValor(p.dir,info);
        }
        return p;
    }
    public int maximo(){
        NO aux = root;
        while(aux.dir != null){
            aux = aux.dir;
        }
        return  aux.dado;
    }
    public int minimo(){
        NO aux = root;
        while (aux.esq != null)
            aux = aux.esq;
        return aux.dado;
    }

}
