
 static boolean prime[] = new boolean[(int)1e7];     
static void sieveOfEratosthenes() 
    { 
       
        for(int i=0;i<(int)1e7;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
           if(prime[p] == true) 
            { 
               for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
    }
       
