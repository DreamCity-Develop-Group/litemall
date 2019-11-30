package org.linlinjava.litemall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GameRuleItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column game_rule_item.item_id
     *
     * @mbg.generated
     */
    private Integer itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column game_rule_item.item_flag
     *
     * @mbg.generated
     */
    private String itemFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column game_rule_item.item_name
     *
     * @mbg.generated
     */
    private String itemName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column game_rule_item.item_desc
     *
     * @mbg.generated
     */
    private String itemDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column game_rule_item.item_state
     *
     * @mbg.generated
     */
    private Byte itemState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column game_rule_item.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column game_rule_item.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_rule_item.item_id
     *
     * @return the value of game_rule_item.item_id
     *
     * @mbg.generated
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_rule_item.item_id
     *
     * @param itemId the value for game_rule_item.item_id
     *
     * @mbg.generated
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_rule_item.item_flag
     *
     * @return the value of game_rule_item.item_flag
     *
     * @mbg.generated
     */
    public String getItemFlag() {
        return itemFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_rule_item.item_flag
     *
     * @param itemFlag the value for game_rule_item.item_flag
     *
     * @mbg.generated
     */
    public void setItemFlag(String itemFlag) {
        this.itemFlag = itemFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_rule_item.item_name
     *
     * @return the value of game_rule_item.item_name
     *
     * @mbg.generated
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_rule_item.item_name
     *
     * @param itemName the value for game_rule_item.item_name
     *
     * @mbg.generated
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_rule_item.item_desc
     *
     * @return the value of game_rule_item.item_desc
     *
     * @mbg.generated
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_rule_item.item_desc
     *
     * @param itemDesc the value for game_rule_item.item_desc
     *
     * @mbg.generated
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_rule_item.item_state
     *
     * @return the value of game_rule_item.item_state
     *
     * @mbg.generated
     */
    public Byte getItemState() {
        return itemState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_rule_item.item_state
     *
     * @param itemState the value for game_rule_item.item_state
     *
     * @mbg.generated
     */
    public void setItemState(Byte itemState) {
        this.itemState = itemState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_rule_item.create_time
     *
     * @return the value of game_rule_item.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_rule_item.create_time
     *
     * @param createTime the value for game_rule_item.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_rule_item.update_time
     *
     * @return the value of game_rule_item.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_rule_item.update_time
     *
     * @param updateTime the value for game_rule_item.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_rule_item
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemId=").append(itemId);
        sb.append(", itemFlag=").append(itemFlag);
        sb.append(", itemName=").append(itemName);
        sb.append(", itemDesc=").append(itemDesc);
        sb.append(", itemState=").append(itemState);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_rule_item
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GameRuleItem other = (GameRuleItem) that;
        return (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemFlag() == null ? other.getItemFlag() == null : this.getItemFlag().equals(other.getItemFlag()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getItemDesc() == null ? other.getItemDesc() == null : this.getItemDesc().equals(other.getItemDesc()))
            && (this.getItemState() == null ? other.getItemState() == null : this.getItemState().equals(other.getItemState()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_rule_item
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemFlag() == null) ? 0 : getItemFlag().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getItemDesc() == null) ? 0 : getItemDesc().hashCode());
        result = prime * result + ((getItemState() == null) ? 0 : getItemState().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table game_rule_item
     *
     * @mbg.generated
     */
    public enum Column {
        itemId("item_id", "itemId", "INTEGER", false),
        itemFlag("item_flag", "itemFlag", "VARCHAR", false),
        itemName("item_name", "itemName", "VARCHAR", false),
        itemDesc("item_desc", "itemDesc", "VARCHAR", false),
        itemState("item_state", "itemState", "TINYINT", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table game_rule_item
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}