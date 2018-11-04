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
 * last_week object
 */
@ApiModel(description = "last_week object")
public class FactionWarfareLeaderboardLastWeekVictoryPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("amount")
    private Integer amount = null;

    @SerializedName("faction_id")
    private Integer factionId = null;

    public FactionWarfareLeaderboardLastWeekVictoryPoints amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Amount of victory points
     * 
     * @return amount
     **/
    @ApiModelProperty(example = "null", value = "Amount of victory points")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public FactionWarfareLeaderboardLastWeekVictoryPoints factionId(Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    /**
     * faction_id integer
     * 
     * @return factionId
     **/
    @ApiModelProperty(example = "null", value = "faction_id integer")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardLastWeekVictoryPoints factionWarfareLeaderboardLastWeekVictoryPoints = (FactionWarfareLeaderboardLastWeekVictoryPoints) o;
        return Objects.equals(this.amount, factionWarfareLeaderboardLastWeekVictoryPoints.amount)
                && Objects.equals(this.factionId, factionWarfareLeaderboardLastWeekVictoryPoints.factionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, factionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardLastWeekVictoryPoints {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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
