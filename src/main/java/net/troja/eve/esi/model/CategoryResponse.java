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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CategoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("category_id")
    private Integer categoryId = null;

    @SerializedName("groups")
    private List<Integer> groups = new ArrayList<Integer>();

    @SerializedName("name")
    private String name = null;

    @SerializedName("published")
    private Boolean published = null;

    public CategoryResponse categoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * category_id integer
     * 
     * @return categoryId
     **/
    @ApiModelProperty(example = "null", required = true, value = "category_id integer")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public CategoryResponse groups(List<Integer> groups) {
        this.groups = groups;
        return this;
    }

    public CategoryResponse addGroupsItem(Integer groupsItem) {
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * groups array
     * 
     * @return groups
     **/
    @ApiModelProperty(example = "null", required = true, value = "groups array")
    public List<Integer> getGroups() {
        return groups;
    }

    public void setGroups(List<Integer> groups) {
        this.groups = groups;
    }

    public CategoryResponse name(String name) {
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

    public CategoryResponse published(Boolean published) {
        this.published = published;
        return this;
    }

    /**
     * published boolean
     * 
     * @return published
     **/
    @ApiModelProperty(example = "null", required = true, value = "published boolean")
    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CategoryResponse categoryResponse = (CategoryResponse) o;
        return Objects.equals(this.categoryId, categoryResponse.categoryId)
                && Objects.equals(this.groups, categoryResponse.groups)
                && Objects.equals(this.name, categoryResponse.name)
                && Objects.equals(this.published, categoryResponse.published);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, groups, name, published);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryResponse {\n");

        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    published: ").append(toIndentedString(published)).append("\n");
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
