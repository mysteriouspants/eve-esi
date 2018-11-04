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
 * yesterday object
 */
@ApiModel(description = "yesterday object")
public class FactionWarfareLeaderboardCorporationYesterdayVictoryPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("amount")
    private Integer amount = null;

    @SerializedName("corporation_id")
    private Integer corporationId = null;

    public FactionWarfareLeaderboardCorporationYesterdayVictoryPoints amount(Integer amount) {
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

    public FactionWarfareLeaderboardCorporationYesterdayVictoryPoints corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @ApiModelProperty(example = "null", value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCorporationYesterdayVictoryPoints factionWarfareLeaderboardCorporationYesterdayVictoryPoints = (FactionWarfareLeaderboardCorporationYesterdayVictoryPoints) o;
        return Objects.equals(this.amount, factionWarfareLeaderboardCorporationYesterdayVictoryPoints.amount)
                && Objects.equals(this.corporationId,
                        factionWarfareLeaderboardCorporationYesterdayVictoryPoints.corporationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, corporationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCorporationYesterdayVictoryPoints {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
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
