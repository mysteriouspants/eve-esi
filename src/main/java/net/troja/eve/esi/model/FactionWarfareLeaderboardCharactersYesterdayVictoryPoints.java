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
public class FactionWarfareLeaderboardCharactersYesterdayVictoryPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("amount")
    private Integer amount = null;

    @SerializedName("character_id")
    private Integer characterId = null;

    public FactionWarfareLeaderboardCharactersYesterdayVictoryPoints amount(Integer amount) {
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

    public FactionWarfareLeaderboardCharactersYesterdayVictoryPoints characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(example = "null", value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCharactersYesterdayVictoryPoints factionWarfareLeaderboardCharactersYesterdayVictoryPoints = (FactionWarfareLeaderboardCharactersYesterdayVictoryPoints) o;
        return Objects.equals(this.amount, factionWarfareLeaderboardCharactersYesterdayVictoryPoints.amount)
                && Objects.equals(this.characterId,
                        factionWarfareLeaderboardCharactersYesterdayVictoryPoints.characterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, characterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCharactersYesterdayVictoryPoints {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
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
