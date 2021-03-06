package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 07 12:55:47 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmpUserMasterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        MmpUserMasterId,
        MmpUserMasterName,
        MmpUserMasterPwd,
        Ast,
        MmpRoleMasterId,
        MemberRegId,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int MMPUSERMASTERID = AttributesEnum.MmpUserMasterId.index();
    public static final int MMPUSERMASTERNAME = AttributesEnum.MmpUserMasterName.index();
    public static final int MMPUSERMASTERPWD = AttributesEnum.MmpUserMasterPwd.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int MMPROLEMASTERID = AttributesEnum.MmpRoleMasterId.index();
    public static final int MEMBERREGID = AttributesEnum.MemberRegId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmpUserMasterImpl() {
    }

    /**
     * Gets the attribute value for MmpUserMasterId, using the alias name MmpUserMasterId.
     * @return the value of MmpUserMasterId
     */
    public BigDecimal getMmpUserMasterId() {
        return (BigDecimal) getAttributeInternal(MMPUSERMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpUserMasterId.
     * @param value value to set the MmpUserMasterId
     */
    public void setMmpUserMasterId(BigDecimal value) {
        setAttributeInternal(MMPUSERMASTERID, value);
    }

    /**
     * Gets the attribute value for MmpUserMasterName, using the alias name MmpUserMasterName.
     * @return the value of MmpUserMasterName
     */
    public String getMmpUserMasterName() {
        return (String) getAttributeInternal(MMPUSERMASTERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpUserMasterName.
     * @param value value to set the MmpUserMasterName
     */
    public void setMmpUserMasterName(String value) {
        setAttributeInternal(MMPUSERMASTERNAME, value);
    }

    /**
     * Gets the attribute value for MmpUserMasterPwd, using the alias name MmpUserMasterPwd.
     * @return the value of MmpUserMasterPwd
     */
    public String getMmpUserMasterPwd() {
        return (String) getAttributeInternal(MMPUSERMASTERPWD);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpUserMasterPwd.
     * @param value value to set the MmpUserMasterPwd
     */
    public void setMmpUserMasterPwd(String value) {
        setAttributeInternal(MMPUSERMASTERPWD, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for MmpRoleMasterId, using the alias name MmpRoleMasterId.
     * @return the value of MmpRoleMasterId
     */
    public BigDecimal getMmpRoleMasterId() {
        return (BigDecimal) getAttributeInternal(MMPROLEMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpRoleMasterId.
     * @param value value to set the MmpRoleMasterId
     */
    public void setMmpRoleMasterId(BigDecimal value) {
        setAttributeInternal(MMPROLEMASTERID, value);
    }

    /**
     * Gets the attribute value for MemberRegId, using the alias name MemberRegId.
     * @return the value of MemberRegId
     */
    public BigDecimal getMemberRegId() {
        return (BigDecimal) getAttributeInternal(MEMBERREGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MemberRegId.
     * @param value value to set the MemberRegId
     */
    public void setMemberRegId(BigDecimal value) {
        setAttributeInternal(MEMBERREGID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * @param mmpUserMasterId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal mmpUserMasterId) {
        return new Key(new Object[] { mmpUserMasterId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.MmpUserMaster");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
         try {
             loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {
             setCreatedBy(loginId);
             setUpdatedBy(loginId);
             } else if(operation == DML_UPDATE) {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}

