/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterShipResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("ship_item_id")
    private Long shipItemId = null;

    @SerializedName("ship_name")
    private String shipName = null;

    @SerializedName("ship_type_id")
    private Integer shipTypeId = null;

    public CharacterShipResponse shipItemId(Long shipItemId) {
        this.shipItemId = shipItemId;
        return this;
    }

    /**
     * Item id's are unique to a ship and persist until it is repackaged. This
     * value can be used to track repeated uses of a ship, or detect when a
     * pilot changes into a different instance of the same ship type.
     * 
     * @return shipItemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Item id's are unique to a ship and persist until it is repackaged. This value can be used to track repeated uses of a ship, or detect when a pilot changes into a different instance of the same ship type.")
    public Long getShipItemId() {
        return shipItemId;
    }

    public void setShipItemId(Long shipItemId) {
        this.shipItemId = shipItemId;
    }

    public CharacterShipResponse shipName(String shipName) {
        this.shipName = shipName;
        return this;
    }

    /**
     * ship_name string
     * 
     * @return shipName
     **/
    @ApiModelProperty(example = "null", required = true, value = "ship_name string")
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public CharacterShipResponse shipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
        return this;
    }

    /**
     * ship_type_id integer
     * 
     * @return shipTypeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ship_type_id integer")
    public Integer getShipTypeId() {
        return shipTypeId;
    }

    public void setShipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterShipResponse characterShipResponse = (CharacterShipResponse) o;
        return Objects.equals(this.shipItemId, characterShipResponse.shipItemId)
                && Objects.equals(this.shipName, characterShipResponse.shipName)
                && Objects.equals(this.shipTypeId, characterShipResponse.shipTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipItemId, shipName, shipTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterShipResponse {\n");

        sb.append("    shipItemId: ").append(toIndentedString(shipItemId)).append("\n");
        sb.append("    shipName: ").append(toIndentedString(shipName)).append("\n");
        sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
