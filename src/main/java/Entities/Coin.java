package Entities;

public class Coin {
    private  String rank;
    private String name;
    private String Acro;
    private  double price;
    private String h24;
    private String _7d;
    private String vol_h24$;
    private String vol_h24c;
    private  String supply;

    public Coin() {
    }
    public void setAll(String attribute,String jbedlia){
        System.out.println(attribute);

        if(attribute.equals("rank"))
            this.rank=jbedlia;

        if(attribute.equals("name")){
            String[] spreaded=jbedlia.split("[0-9]");
            this.name=spreaded[0];
            this.Acro=spreaded[1];
            //this.Acro=spreaded[2];
        }
        ;


        if(attribute.equals("h24"))
            this.h24=jbedlia;
        if(attribute.equals("_7d"))
            this._7d=jbedlia;
        if(attribute.equals("price"))
            this.price=Double.parseDouble(jbedlia.replace("$","").replace(",","").replace(this.Acro,""));
        if(attribute.equals("vol_h24$")){
            String[] str=jbedlia.replace("$","").split("[,|.]");
            this.vol_h24$="";
            for(int count=0;count<str.length;count++){
                if(count!=1)
                    this.vol_h24$+=str[count];
            }

        }

        if(attribute.equals("vol_h24c"))
            this.vol_h24c=jbedlia;
        if(attribute.equals("supply"))
            this.supply=jbedlia;


    }
    public void getAll(){
        System.out.println(this.name+" "+this.price+" "+this.h24+" and the acro is"+this.Acro+"  "+"  "+this.vol_h24$+ " the supply is ");
    }
}
