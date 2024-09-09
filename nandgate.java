class nandgate {
    
    static int ina;
    static int inb;

    static int out(){

        if(ina == 1 && inb == 1){
            return 0;
        }
        else{
            return 1;
        }
    }
}