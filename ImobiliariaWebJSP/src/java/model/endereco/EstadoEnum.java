package model.endereco;

/**
 *
 * @author marlon
 */

public enum EstadoEnum {
    SELECIONE("Selecione"),
    AC("Acre"), // 
    AL("Alagoas"), // 
    AP("Amapá"), // 
    AM("Amazonas"), // 
    BA("Bahia"), // 
    CE("Ceará"), // 
    DF("Distrito Federal"), // 
    ES("Espírito Santo"), // 
    GO("Goiás"), // 
    MA("Maranhão"), // 
    MT("Mato Grosso"), // 
    MS("Mato Grosso do Sul"), // 
    MG("Minas Gerais"), // 
    PA("Pará"), // 
    PB("Paraíba"), // 
    PR("Paraná"), // 
    PE("Pernambuco"), // 
    PI("Piauí"), // 
    RR("Roraima"), // 
    RO("Rondônia"), // 
    RJ("Rio de Janeiro"), // 
    RN("Rio Grande do Norte"), // 
    RS("Rio Grande do Sul"), // 
    SC("Santa Catarina"), // 
    SP("São Paulo"), // 
    SE("Sergipe"), // 
    TO("Tocantins"); //    
    
    private String uf;
    private EstadoEnum(String uf){
        this.uf = uf;
    }
    
    public String getUf(){
        return this.uf;
    }
    
    public static String[] getUfs() {  
        String[] estado = new String[EstadoEnum.values().length];  
        for (EstadoEnum estadoEnum : EstadoEnum.values()) {  
            estado[estadoEnum.ordinal()] = estadoEnum.getUf();  
        }  
        return estado ;  
    } 
    
    public static EstadoEnum getEnum(String string){
        switch (string) {
            case "Selecione":
                return SELECIONE;
            case "Acre":
                return AC;
            case "Alagoas":
                return AL;
            case "Amapá":
                return AP;
            case "Amazonas":
                return AM;
            case "Bahia":
                return BA;
            case "Ceará":
                return CE;
            case "Distrito Federal":
                return DF;
            case "Espírito Santo":
                return ES;
            case "Goiás":
                return GO;
            case "Maranhão":
                return MA;
            case "Mato Grosso":
                return MT;
            case "Mato Grosso do Sul":
                return MS;     
            case "Minas Gerais":
                return MG;  
            case "Pará":
                return PA;
            case "Paraíba":
                return PB;
            case "Paraná":
                return PR;
            case "Pernambuco":
                return PE;
            case "Piauí":
                return PI;
            case "Roraima":
                return RR;
            case "Rondônia":
                return RO;
            case "Rio de Janeiro":
                return RJ;
            case "Rio Grande do Norte":
                return RN;
            case "Rio Grande do Sul":
                return RS;
            case "Santa Catarina":
                return SC;
            case "São Paulo":
                return SP;
            case "Sergipe":
                return SE;
            case "Tocantins":
                return TO;
        }
        return null;
     }  
}