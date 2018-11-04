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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationMedalsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("created_at")
    private OffsetDateTime createdAt = null;

    @SerializedName("creator_id")
    private Integer creatorId = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("medal_id")
    private Integer medalId = null;

    @SerializedName("title")
    private String title = null;

    public CorporationMedalsResponse createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * created_at string
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "null", required = true, value = "created_at string")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CorporationMedalsResponse creatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * ID of the character who created this medal
     * 
     * @return creatorId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID of the character who created this medal")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public CorporationMedalsResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(example = "null", required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CorporationMedalsResponse medalId(Integer medalId) {
        this.medalId = medalId;
        return this;
    }

    /**
     * medal_id integer
     * 
     * @return medalId
     **/
    @ApiModelProperty(example = "null", required = true, value = "medal_id integer")
    public Integer getMedalId() {
        return medalId;
    }

    public void setMedalId(Integer medalId) {
        this.medalId = medalId;
    }

    public CorporationMedalsResponse title(String title) {
        this.title = title;
        return this;
    }

    /**
     * title string
     * 
     * @return title
     **/
    @ApiModelProperty(example = "null", required = true, value = "title string")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationMedalsResponse corporationMedalsResponse = (CorporationMedalsResponse) o;
        return Objects.equals(this.createdAt, corporationMedalsResponse.createdAt)
                && Objects.equals(this.creatorId, corporationMedalsResponse.creatorId)
                && Objects.equals(this.description, corporationMedalsResponse.description)
                && Objects.equals(this.medalId, corporationMedalsResponse.medalId)
                && Objects.equals(this.title, corporationMedalsResponse.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, creatorId, description, medalId, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationMedalsResponse {\n");

        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    medalId: ").append(toIndentedString(medalId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
