class nandgate {

    int ina;
    int inb;
    int result;

    void out(){

        if(ina == 1 && inb == 1){
            result = 0;
        }
        else{
            result = 1;
        }
    }
}
