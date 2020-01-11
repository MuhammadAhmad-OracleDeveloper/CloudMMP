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
// ---    Mon Jan 06 17:14:59 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmpTrainingCheckOutImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        MmpTrainingCheckOutId,
        MmpTrainingMonInspId,
        Remarks,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TrainingEnd,
        TrainingStart,
        ClusterId,
        Dated,
        MemberRegId,
        MmpTrainingMonInsp;
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

    public static final int MMPTRAININGCHECKOUTID = AttributesEnum.MmpTrainingCheckOutId.index();
    public static final int MMPTRAININGMONINSPID = AttributesEnum.MmpTrainingMonInspId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TRAININGEND = AttributesEnum.TrainingEnd.index();
    public static final int TRAININGSTART = AttributesEnum.TrainingStart.index();
    public static final int CLUSTERID = AttributesEnum.ClusterId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int MEMBERREGID = AttributesEnum.MemberRegId.index();
    public static final int MMPTRAININGMONINSP = AttributesEnum.MmpTrainingMonInsp.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmpTrainingCheckOutImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.MmpTrainingCheckOut");
    }

    /**
     * Gets the attribute value for MmpTrainingCheckOutId, using the alias name MmpTrainingCheckOutId.
     * @return the value of MmpTrainingCheckOutId
     */
    public BigDecimal getMmpTrainingCheckOutId() {
        return (BigDecimal) getAttributeInternal(MMPTRAININGCHECKOUTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpTrainingCheckOutId.
     * @param value value to set the MmpTrainingCheckOutId
     */
    public void setMmpTrainingCheckOutId(BigDecimal value) {
        setAttributeInternal(MMPTRAININGCHECKOUTID, value);
    }

    /**
     * Gets the attribute value for MmpTrainingMonInspId, using the alias name MmpTrainingMonInspId.
     * @return the value of MmpTrainingMonInspId
     */
    public BigDecimal getMmpTrainingMonInspId() {
        return (BigDecimal) getAttributeInternal(MMPTRAININGMONINSPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpTrainingMonInspId.
     * @param value value to set the MmpTrainingMonInspId
     */
    public void setMmpTrainingMonInspId(BigDecimal value) {
        setAttributeInternal(MMPTRAININGMONINSPID, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
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
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
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
     * Gets the attribute value for TrainingEnd, using the alias name TrainingEnd.
     * @return the value of TrainingEnd
     */
    public Timestamp getTrainingEnd() {
        return (Timestamp) getAttributeInternal(TRAININGEND);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrainingEnd.
     * @param value value to set the TrainingEnd
     */
    public void setTrainingEnd(Timestamp value) {
        setAttributeInternal(TRAININGEND, value);
    }

    /**
     * Gets the attribute value for TrainingStart, using the alias name TrainingStart.
     * @return the value of TrainingStart
     */
    public Timestamp getTrainingStart() {
        return (Timestamp) getAttributeInternal(TRAININGSTART);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrainingStart.
     * @param value value to set the TrainingStart
     */
    public void setTrainingStart(Timestamp value) {
        setAttributeInternal(TRAININGSTART, value);
    }

    /**
     * Gets the attribute value for ClusterId, using the alias name ClusterId.
     * @return the value of ClusterId
     */
    public BigDecimal getClusterId() {
        return (BigDecimal) getAttributeInternal(CLUSTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClusterId.
     * @param value value to set the ClusterId
     */
    public void setClusterId(BigDecimal value) {
        setAttributeInternal(CLUSTERID, value);
    }

    /**
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public MmpTrainingMonInspImpl getMmpTrainingMonInsp() {
        return (MmpTrainingMonInspImpl) getAttributeInternal(MMPTRAININGMONINSP);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setMmpTrainingMonInsp(MmpTrainingMonInspImpl value) {
        setAttributeInternal(MMPTRAININGMONINSP, value);
    }


    /**
     * @param mmpTrainingCheckOutId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal mmpTrainingCheckOutId) {
        return new Key(new Object[] { mmpTrainingCheckOutId });
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

