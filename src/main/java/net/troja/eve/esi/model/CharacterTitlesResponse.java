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
public class CharacterTitlesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("name")
    private String name = null;

    @SerializedName("title_id")
    private Integer titleId = null;

    public CharacterTitlesResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterTitlesResponse titleId(Integer titleId) {
        this.titleId = titleId;
        return this;
    }

    /**
     * title_id integer
     * 
     * @return titleId
     **/
    @ApiModelProperty(example = "null", value = "title_id integer")
    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterTitlesResponse characterTitlesResponse = (CharacterTitlesResponse) o;
        return Objects.equals(this.name, characterTitlesResponse.name)
                && Objects.equals(this.titleId, characterTitlesResponse.titleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, titleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterTitlesResponse {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
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
