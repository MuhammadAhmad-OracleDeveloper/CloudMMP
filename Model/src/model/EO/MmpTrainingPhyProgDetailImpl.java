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
// ---    Mon Jan 06 17:20:10 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmpTrainingPhyProgDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        MmpTrngPhyProgMstId,
        MmpTrngPhyProgDetId,
        PlanTraining,
        HeldTraining,
        MonTraining,
        HeldTrainingPerc,
        Description,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        MmpTrainingPhyProgMaster;
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
    public static final int MMPTRNGPHYPROGMSTID = AttributesEnum.MmpTrngPhyProgMstId.index();
    public static final int MMPTRNGPHYPROGDETID = AttributesEnum.MmpTrngPhyProgDetId.index();
    public static final int PLANTRAINING = AttributesEnum.PlanTraining.index();
    public static final int HELDTRAINING = AttributesEnum.HeldTraining.index();
    public static final int MONTRAINING = AttributesEnum.MonTraining.index();
    public static final int HELDTRAININGPERC = AttributesEnum.HeldTrainingPerc.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int MMPTRAININGPHYPROGMASTER = AttributesEnum.MmpTrainingPhyProgMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmpTrainingPhyProgDetailImpl() {
    }

    /**
     * Gets the attribute value for MmpTrngPhyProgMstId, using the alias name MmpTrngPhyProgMstId.
     * @return the value of MmpTrngPhyProgMstId
     */
    public BigDecimal getMmpTrngPhyProgMstId() {
        return (BigDecimal) getAttributeInternal(MMPTRNGPHYPROGMSTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpTrngPhyProgMstId.
     * @param value value to set the MmpTrngPhyProgMstId
     */
    public void setMmpTrngPhyProgMstId(BigDecimal value) {
        setAttributeInternal(MMPTRNGPHYPROGMSTID, value);
    }

    /**
     * Gets the attribute value for MmpTrngPhyProgDetId, using the alias name MmpTrngPhyProgDetId.
     * @return the value of MmpTrngPhyProgDetId
     */
    public BigDecimal getMmpTrngPhyProgDetId() {
        return (BigDecimal) getAttributeInternal(MMPTRNGPHYPROGDETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpTrngPhyProgDetId.
     * @param value value to set the MmpTrngPhyProgDetId
     */
    public void setMmpTrngPhyProgDetId(BigDecimal value) {
        setAttributeInternal(MMPTRNGPHYPROGDETID, value);
    }

    /**
     * Gets the attribute value for PlanTraining, using the alias name PlanTraining.
     * @return the value of PlanTraining
     */
    public BigDecimal getPlanTraining() {
        return (BigDecimal) getAttributeInternal(PLANTRAINING);
    }

    /**
     * Sets <code>value</code> as the attribute value for PlanTraining.
     * @param value value to set the PlanTraining
     */
    public void setPlanTraining(BigDecimal value) {
        setAttributeInternal(PLANTRAINING, value);
    }

    /**
     * Gets the attribute value for HeldTraining, using the alias name HeldTraining.
     * @return the value of HeldTraining
     */
    public BigDecimal getHeldTraining() {
        return (BigDecimal) getAttributeInternal(HELDTRAINING);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeldTraining.
     * @param value value to set the HeldTraining
     */
    public void setHeldTraining(BigDecimal value) {
        setAttributeInternal(HELDTRAINING, value);
    }

    /**
     * Gets the attribute value for MonTraining, using the alias name MonTraining.
     * @return the value of MonTraining
     */
    public BigDecimal getMonTraining() {
        return (BigDecimal) getAttributeInternal(MONTRAINING);
    }

    /**
     * Sets <code>value</code> as the attribute value for MonTraining.
     * @param value value to set the MonTraining
     */
    public void setMonTraining(BigDecimal value) {
        setAttributeInternal(MONTRAINING, value);
    }

    /**
     * Gets the attribute value for HeldTrainingPerc, using the alias name HeldTrainingPerc.
     * @return the value of HeldTrainingPerc
     */
    public BigDecimal getHeldTrainingPerc() {
        return (BigDecimal) getAttributeInternal(HELDTRAININGPERC);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeldTrainingPerc.
     * @param value value to set the HeldTrainingPerc
     */
    public void setHeldTrainingPerc(BigDecimal value) {
        setAttributeInternal(HELDTRAININGPERC, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getMmpTrainingPhyProgMaster() {
        return (EntityImpl) getAttributeInternal(MMPTRAININGPHYPROGMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setMmpTrainingPhyProgMaster(EntityImpl value) {
        setAttributeInternal(MMPTRAININGPHYPROGMASTER, value);
    }

    /**
     * @param mmpTrngPhyProgDetId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal mmpTrngPhyProgDetId) {
        return new Key(new Object[] { mmpTrngPhyProgDetId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.MmpTrainingPhyProgDetail");
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

