package petStore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Store implements Serializable {
    public int id;
    public int petId;
    public int quantity;
    public Date shipDate;
    public String status;
    public boolean complete;

}
