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
 * orbital object
 */
@ApiModel(description = "orbital object")
public class CharacterStatsOrbital implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("strike_characters_killed")
    private Long strikeCharactersKilled = null;

    @SerializedName("strike_damage_to_players_armor_amount")
    private Long strikeDamageToPlayersArmorAmount = null;

    @SerializedName("strike_damage_to_players_shield_amount")
    private Long strikeDamageToPlayersShieldAmount = null;

    public CharacterStatsOrbital strikeCharactersKilled(Long strikeCharactersKilled) {
        this.strikeCharactersKilled = strikeCharactersKilled;
        return this;
    }

    /**
     * strike_characters_killed integer
     * 
     * @return strikeCharactersKilled
     **/
    @ApiModelProperty(example = "null", value = "strike_characters_killed integer")
    public Long getStrikeCharactersKilled() {
        return strikeCharactersKilled;
    }

    public void setStrikeCharactersKilled(Long strikeCharactersKilled) {
        this.strikeCharactersKilled = strikeCharactersKilled;
    }

    public CharacterStatsOrbital strikeDamageToPlayersArmorAmount(Long strikeDamageToPlayersArmorAmount) {
        this.strikeDamageToPlayersArmorAmount = strikeDamageToPlayersArmorAmount;
        return this;
    }

    /**
     * strike_damage_to_players_armor_amount integer
     * 
     * @return strikeDamageToPlayersArmorAmount
     **/
    @ApiModelProperty(example = "null", value = "strike_damage_to_players_armor_amount integer")
    public Long getStrikeDamageToPlayersArmorAmount() {
        return strikeDamageToPlayersArmorAmount;
    }

    public void setStrikeDamageToPlayersArmorAmount(Long strikeDamageToPlayersArmorAmount) {
        this.strikeDamageToPlayersArmorAmount = strikeDamageToPlayersArmorAmount;
    }

    public CharacterStatsOrbital strikeDamageToPlayersShieldAmount(Long strikeDamageToPlayersShieldAmount) {
        this.strikeDamageToPlayersShieldAmount = strikeDamageToPlayersShieldAmount;
        return this;
    }

    /**
     * strike_damage_to_players_shield_amount integer
     * 
     * @return strikeDamageToPlayersShieldAmount
     **/
    @ApiModelProperty(example = "null", value = "strike_damage_to_players_shield_amount integer")
    public Long getStrikeDamageToPlayersShieldAmount() {
        return strikeDamageToPlayersShieldAmount;
    }

    public void setStrikeDamageToPlayersShieldAmount(Long strikeDamageToPlayersShieldAmount) {
        this.strikeDamageToPlayersShieldAmount = strikeDamageToPlayersShieldAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStatsOrbital characterStatsOrbital = (CharacterStatsOrbital) o;
        return Objects.equals(this.strikeCharactersKilled, characterStatsOrbital.strikeCharactersKilled)
                && Objects.equals(this.strikeDamageToPlayersArmorAmount,
                        characterStatsOrbital.strikeDamageToPlayersArmorAmount)
                && Objects.equals(this.strikeDamageToPlayersShieldAmount,
                        characterStatsOrbital.strikeDamageToPlayersShieldAmount);
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(strikeCharactersKilled, strikeDamageToPlayersArmorAmount, strikeDamageToPlayersShieldAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStatsOrbital {\n");

        sb.append("    strikeCharactersKilled: ").append(toIndentedString(strikeCharactersKilled)).append("\n");
        sb.append("    strikeDamageToPlayersArmorAmount: ").append(toIndentedString(strikeDamageToPlayersArmorAmount))
                .append("\n");
        sb.append("    strikeDamageToPlayersShieldAmount: ")
                .append(toIndentedString(strikeDamageToPlayersShieldAmount)).append("\n");
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
