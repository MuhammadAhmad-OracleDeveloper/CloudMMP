package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 06 17:08:48 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmpMonSchDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        MmpMonSchDetailId,
        MmpMonSchMasterId,
        ClusterId,
        Dated,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TrainingSchDetailId,
        ClassType,
        ModuleId,
        MmpMonSchMaster,
        TblCluster,
        TblTrainingSchDetail,
        MmpTrainingCheckIn;
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


    public static final int MMPMONSCHDETAILID = AttributesEnum.MmpMonSchDetailId.index();
    public static final int MMPMONSCHMASTERID = AttributesEnum.MmpMonSchMasterId.index();
    public static final int CLUSTERID = AttributesEnum.ClusterId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TRAININGSCHDETAILID = AttributesEnum.TrainingSchDetailId.index();
    public static final int CLASSTYPE = AttributesEnum.ClassType.index();
    public static final int MODULEID = AttributesEnum.ModuleId.index();
    public static final int MMPMONSCHMASTER = AttributesEnum.MmpMonSchMaster.index();
    public static final int TBLCLUSTER = AttributesEnum.TblCluster.index();
    public static final int TBLTRAININGSCHDETAIL = AttributesEnum.TblTrainingSchDetail.index();
    public static final int MMPTRAININGCHECKIN = AttributesEnum.MmpTrainingCheckIn.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmpMonSchDetailImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.MmpMonSchDetail");
    }


    /**
     * Gets the attribute value for MmpMonSchDetailId, using the alias name MmpMonSchDetailId.
     * @return the value of MmpMonSchDetailId
     */
    public BigDecimal getMmpMonSchDetailId() {
        return (BigDecimal) getAttributeInternal(MMPMONSCHDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpMonSchDetailId.
     * @param value value to set the MmpMonSchDetailId
     */
    public void setMmpMonSchDetailId(BigDecimal value) {
        setAttributeInternal(MMPMONSCHDETAILID, value);
    }

    /**
     * Gets the attribute value for MmpMonSchMasterId, using the alias name MmpMonSchMasterId.
     * @return the value of MmpMonSchMasterId
     */
    public BigDecimal getMmpMonSchMasterId() {
        return (BigDecimal) getAttributeInternal(MMPMONSCHMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpMonSchMasterId.
     * @param value value to set the MmpMonSchMasterId
     */
    public void setMmpMonSchMasterId(BigDecimal value) {
        setAttributeInternal(MMPMONSCHMASTERID, value);
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
     * Gets the attribute value for TrainingSchDetailId, using the alias name TrainingSchDetailId.
     * @return the value of TrainingSchDetailId
     */
    public BigDecimal getTrainingSchDetailId() {
        return (BigDecimal) getAttributeInternal(TRAININGSCHDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrainingSchDetailId.
     * @param value value to set the TrainingSchDetailId
     */
    public void setTrainingSchDetailId(BigDecimal value) {
        setAttributeInternal(TRAININGSCHDETAILID, value);
    }

    /**
     * Gets the attribute value for ClassType, using the alias name ClassType.
     * @return the value of ClassType
     */
    public String getClassType() {
        return (String) getAttributeInternal(CLASSTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClassType.
     * @param value value to set the ClassType
     */
    public void setClassType(String value) {
        setAttributeInternal(CLASSTYPE, value);
    }

    /**
     * Gets the attribute value for ModuleId, using the alias name ModuleId.
     * @return the value of ModuleId
     */
    public BigDecimal getModuleId() {
        return (BigDecimal) getAttributeInternal(MODULEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModuleId.
     * @param value value to set the ModuleId
     */
    public void setModuleId(BigDecimal value) {
        setAttributeInternal(MODULEID, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public MmpMonSchMasterImpl getMmpMonSchMaster() {
        return (MmpMonSchMasterImpl) getAttributeInternal(MMPMONSCHMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setMmpMonSchMaster(MmpMonSchMasterImpl value) {
        setAttributeInternal(MMPMONSCHMASTER, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblCluster() {
        return (EntityImpl) getAttributeInternal(TBLCLUSTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblCluster(EntityImpl value) {
        setAttributeInternal(TBLCLUSTER, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblTrainingSchDetail() {
        return (EntityImpl) getAttributeInternal(TBLTRAININGSCHDETAIL);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblTrainingSchDetail(EntityImpl value) {
        setAttributeInternal(TBLTRAININGSCHDETAIL, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMmpTrainingCheckIn() {
        return (RowIterator) getAttributeInternal(MMPTRAININGCHECKIN);
    }


    /**
     * @param mmpMonSchDetailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal mmpMonSchDetailId) {
        return new Key(new Object[] { mmpMonSchDetailId });
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

