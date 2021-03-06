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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationBookmarkFoldersResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("creator_id")
    private Integer creatorId = null;

    @JsonProperty("folder_id")
    private Integer folderId = null;

    @JsonProperty("name")
    private String name = null;

    public CorporationBookmarkFoldersResponse creatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * creator_id integer
     * 
     * @return creatorId
     **/
    @ApiModelProperty(example = "null", value = "creator_id integer")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public CorporationBookmarkFoldersResponse folderId(Integer folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * folder_id integer
     * 
     * @return folderId
     **/
    @ApiModelProperty(example = "null", required = true, value = "folder_id integer")
    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public CorporationBookmarkFoldersResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(example = "null", required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationBookmarkFoldersResponse corporationBookmarkFoldersResponse = (CorporationBookmarkFoldersResponse) o;
        return Objects.equals(this.creatorId, corporationBookmarkFoldersResponse.creatorId)
                && Objects.equals(this.folderId, corporationBookmarkFoldersResponse.folderId)
                && Objects.equals(this.name, corporationBookmarkFoldersResponse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creatorId, folderId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationBookmarkFoldersResponse {\n");

        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
