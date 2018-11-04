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
public class WarKillmailsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("killmail_hash")
    private String killmailHash = null;

    @SerializedName("killmail_id")
    private Integer killmailId = null;

    public WarKillmailsResponse killmailHash(String killmailHash) {
        this.killmailHash = killmailHash;
        return this;
    }

    /**
     * A hash of this killmail
     * 
     * @return killmailHash
     **/
    @ApiModelProperty(example = "null", required = true, value = "A hash of this killmail")
    public String getKillmailHash() {
        return killmailHash;
    }

    public void setKillmailHash(String killmailHash) {
        this.killmailHash = killmailHash;
    }

    public WarKillmailsResponse killmailId(Integer killmailId) {
        this.killmailId = killmailId;
        return this;
    }

    /**
     * ID of this killmail
     * 
     * @return killmailId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID of this killmail")
    public Integer getKillmailId() {
        return killmailId;
    }

    public void setKillmailId(Integer killmailId) {
        this.killmailId = killmailId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WarKillmailsResponse warKillmailsResponse = (WarKillmailsResponse) o;
        return Objects.equals(this.killmailHash, warKillmailsResponse.killmailHash)
                && Objects.equals(this.killmailId, warKillmailsResponse.killmailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(killmailHash, killmailId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarKillmailsResponse {\n");

        sb.append("    killmailHash: ").append(toIndentedString(killmailHash)).append("\n");
        sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
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
