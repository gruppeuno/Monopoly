package Game;

public class FieldController {
    private Field[] fields= {
            new Field("START", 0,0,false),
            new Field("BURGERBAREN", 1,1,true),
            new Field("PIZZARIAET", 2,1,true),
            new Field("SLIKBUTIKKEN", 3,1,true),
            new Field("CHANCE", 4,0,false),
            new Field("ISKIOSKEN", 5,1,true),
            new Field("PÅ FÆNGSELSBESØG", 6,0,false),
            new Field("MUSEET", 7,2,true),
            new Field("BIBLIOTEKET", 8,2,true),
            new Field("CHANCE", 9,0,false),
            new Field("SKATERPARKEN", 10,2,true),
            new Field("SWIMMINGPOOLEN", 11,2,true)
    };

    //checker om field er eget
    public boolean checkFieldOwner(int fieldNumber){
        if (fields[fieldNumber].getOwnedByPlayer())
            return true;
        else return false;
    }

    public void landOnField(int playerID, int fieldNumber){

        movePlayer(playerID,fieldNumber);
        //TODO; playerID skal føre til player og i if statement(hvor der står 100) skal være en reference
        //TODO til spillers balance
        int price = fields[fieldNumber].getFieldPrice();

        if (fields[fieldNumber].getIsProperty()){

            if (fields[fieldNumber].getOwnedByPlayer())
            payRent(playerID,fields[fieldNumber].getFieldRent());

            else if (!fields[fieldNumber].getOwnedByPlayer())
            buyField(playerID,fields[fieldNumber]);
        }
    }

    //mangler referance fra playerID
    public void buyField(int playerID, Field field){
        field.setPlayerID(playerID);
        //p.b.updateBalance(field.getFieldPrice());
        }

    public void payRent(int playerID, int rent) {

        }

    public void movePlayer(int playerID, int fieldNumber) {
        }
    }
