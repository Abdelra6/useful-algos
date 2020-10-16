//union find by rank 

static class DSU{
static final int MaxN=(int)1e6;
static int id[]=new int [MaxN];
static int rank[]=new int [MaxN];
public DSU(){


	
}
static boolean connected(int i,int j){
return root(i)==root(j);
}	
static int root(int i){
	while(i!=id[i]){
		i=id[i];
	}
	return i;
}

static void union(int p,int q){
int i=root(p);
int j=root(q);
if(rank[i]>rank[j]){
id[j]=id[i];
rank[j]+=rank[i];
}
if(rank[i]<=rank[j]){
id[i]=id[j];
rank[i]+=rank[j];
}}
	public static void main(String[] args) {
	
			for(int i=0;i<1000;i++)
		id[i]=i;
	for(int i=0;i<1000;i++)
		rank[i]=1;
	union(1,2);
	union(2,3);
	union(3,4);
	union(4,5);

		System.out.println(root(3));
	}
}
