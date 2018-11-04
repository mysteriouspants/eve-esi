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
 * The defending corporation or alliance that declared this war, only contains
 * either corporation_id or alliance_id
 */
@ApiModel(description = "The defending corporation or alliance that declared this war, only contains either corporation_id or alliance_id")
public class Defender implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("alliance_id")
    private Integer allianceId = null;

    @SerializedName("corporation_id")
    private Integer corporationId = null;

    @SerializedName("isk_destroyed")
    private Float iskDestroyed = null;

    @SerializedName("ships_killed")
    private Integer shipsKilled = null;

    public Defender allianceId(Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * Alliance ID if and only if the defender is an alliance
     * 
     * @return allianceId
     **/
    @ApiModelProperty(example = "null", value = "Alliance ID if and only if the defender is an alliance")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public Defender corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * Corporation ID if and only if the defender is a corporation
     * 
     * @return corporationId
     **/
    @ApiModelProperty(example = "null", value = "Corporation ID if and only if the defender is a corporation")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public Defender iskDestroyed(Float iskDestroyed) {
        this.iskDestroyed = iskDestroyed;
        return this;
    }

    /**
     * ISK value of ships the defender has killed
     * 
     * @return iskDestroyed
     **/
    @ApiModelProperty(example = "null", required = true, value = "ISK value of ships the defender has killed")
    public Float getIskDestroyed() {
        return iskDestroyed;
    }

    public void setIskDestroyed(Float iskDestroyed) {
        this.iskDestroyed = iskDestroyed;
    }

    public Defender shipsKilled(Integer shipsKilled) {
        this.shipsKilled = shipsKilled;
        return this;
    }

    /**
     * The number of ships the defender has killed
     * 
     * @return shipsKilled
     **/
    @ApiModelProperty(example = "null", required = true, value = "The number of ships the defender has killed")
    public Integer getShipsKilled() {
        return shipsKilled;
    }

    public void setShipsKilled(Integer shipsKilled) {
        this.shipsKilled = shipsKilled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Defender defender = (Defender) o;
        return Objects.equals(this.allianceId, defender.allianceId)
                && Objects.equals(this.corporationId, defender.corporationId)
                && Objects.equals(this.iskDestroyed, defender.iskDestroyed)
                && Objects.equals(this.shipsKilled, defender.shipsKilled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceId, corporationId, iskDestroyed, shipsKilled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Defender {\n");

        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    iskDestroyed: ").append(toIndentedString(iskDestroyed)).append("\n");
        sb.append("    shipsKilled: ").append(toIndentedString(shipsKilled)).append("\n");
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
