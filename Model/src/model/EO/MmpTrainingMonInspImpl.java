package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 06 17:17:20 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmpTrainingMonInspImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        MmpTrainingMonInspId,
        ClusterId,
        Dated,
        StartTraining,
        EndTraining,
        TotTrainer,
        AgendaDay,
        ReciteQuran,
        PlanModule,
        EcoSystem,
        RevLastTraining,
        QASess,
        SummDay,
        AnyIec,
        ToolsAdopt,
        IssChlRec,
        DetailAboutOutcome,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        MemberRegId,
        ClusterTest,
        EcoSystemEt,
        EcoSystemSt,
        PlanModuleEt,
        PlanModuleSt,
        QASessEt,
        QASessSt,
        ReciteQuranEt,
        ReciteQuranSt,
        RevLastTrainingEt,
        RevLastTrainingSt,
        SummDayEt,
        SummDaySt,
        TrainingSon,
        NoOfGroup,
        EsaExamPlant,
        EsaIdenDis,
        EsaIdenVar,
        EsaObsGen,
        EsaOthers,
        EsaStuPlant,
        IecBanner,
        IecBroch,
        IecCards,
        IecInform,
        IecNill,
        IecPamp,
        ToolsDemo,
        ToolsDiscus,
        ToolsGroup,
        ToolsLecture,
        ToolsOthers,
        ModuleId,
        TrainingSchDetailId,
        MmpTrainingCheckInId,
        MmpTrainingMonFarmer,
        MmpTrainingMonTopics,
        MmpTrainingMonUrfarmer,
        TblCluster,
        TblCluster1,
        MmpTrainingCheckOut,
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


    public static final int MMPTRAININGMONINSPID = AttributesEnum.MmpTrainingMonInspId.index();
    public static final int CLUSTERID = AttributesEnum.ClusterId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int STARTTRAINING = AttributesEnum.StartTraining.index();
    public static final int ENDTRAINING = AttributesEnum.EndTraining.index();
    public static final int TOTTRAINER = AttributesEnum.TotTrainer.index();
    public static final int AGENDADAY = AttributesEnum.AgendaDay.index();
    public static final int RECITEQURAN = AttributesEnum.ReciteQuran.index();
    public static final int PLANMODULE = AttributesEnum.PlanModule.index();
    public static final int ECOSYSTEM = AttributesEnum.EcoSystem.index();
    public static final int REVLASTTRAINING = AttributesEnum.RevLastTraining.index();
    public static final int QASESS = AttributesEnum.QASess.index();
    public static final int SUMMDAY = AttributesEnum.SummDay.index();
    public static final int ANYIEC = AttributesEnum.AnyIec.index();
    public static final int TOOLSADOPT = AttributesEnum.ToolsAdopt.index();
    public static final int ISSCHLREC = AttributesEnum.IssChlRec.index();
    public static final int DETAILABOUTOUTCOME = AttributesEnum.DetailAboutOutcome.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int MEMBERREGID = AttributesEnum.MemberRegId.index();
    public static final int CLUSTERTEST = AttributesEnum.ClusterTest.index();
    public static final int ECOSYSTEMET = AttributesEnum.EcoSystemEt.index();
    public static final int ECOSYSTEMST = AttributesEnum.EcoSystemSt.index();
    public static final int PLANMODULEET = AttributesEnum.PlanModuleEt.index();
    public static final int PLANMODULEST = AttributesEnum.PlanModuleSt.index();
    public static final int QASESSET = AttributesEnum.QASessEt.index();
    public static final int QASESSST = AttributesEnum.QASessSt.index();
    public static final int RECITEQURANET = AttributesEnum.ReciteQuranEt.index();
    public static final int RECITEQURANST = AttributesEnum.ReciteQuranSt.index();
    public static final int REVLASTTRAININGET = AttributesEnum.RevLastTrainingEt.index();
    public static final int REVLASTTRAININGST = AttributesEnum.RevLastTrainingSt.index();
    public static final int SUMMDAYET = AttributesEnum.SummDayEt.index();
    public static final int SUMMDAYST = AttributesEnum.SummDaySt.index();
    public static final int TRAININGSON = AttributesEnum.TrainingSon.index();
    public static final int NOOFGROUP = AttributesEnum.NoOfGroup.index();
    public static final int ESAEXAMPLANT = AttributesEnum.EsaExamPlant.index();
    public static final int ESAIDENDIS = AttributesEnum.EsaIdenDis.index();
    public static final int ESAIDENVAR = AttributesEnum.EsaIdenVar.index();
    public static final int ESAOBSGEN = AttributesEnum.EsaObsGen.index();
    public static final int ESAOTHERS = AttributesEnum.EsaOthers.index();
    public static final int ESASTUPLANT = AttributesEnum.EsaStuPlant.index();
    public static final int IECBANNER = AttributesEnum.IecBanner.index();
    public static final int IECBROCH = AttributesEnum.IecBroch.index();
    public static final int IECCARDS = AttributesEnum.IecCards.index();
    public static final int IECINFORM = AttributesEnum.IecInform.index();
    public static final int IECNILL = AttributesEnum.IecNill.index();
    public static final int IECPAMP = AttributesEnum.IecPamp.index();
    public static final int TOOLSDEMO = AttributesEnum.ToolsDemo.index();
    public static final int TOOLSDISCUS = AttributesEnum.ToolsDiscus.index();
    public static final int TOOLSGROUP = AttributesEnum.ToolsGroup.index();
    public static final int TOOLSLECTURE = AttributesEnum.ToolsLecture.index();
    public static final int TOOLSOTHERS = AttributesEnum.ToolsOthers.index();
    public static final int MODULEID = AttributesEnum.ModuleId.index();
    public static final int TRAININGSCHDETAILID = AttributesEnum.TrainingSchDetailId.index();
    public static final int MMPTRAININGCHECKINID = AttributesEnum.MmpTrainingCheckInId.index();
    public static final int MMPTRAININGMONFARMER = AttributesEnum.MmpTrainingMonFarmer.index();
    public static final int MMPTRAININGMONTOPICS = AttributesEnum.MmpTrainingMonTopics.index();
    public static final int MMPTRAININGMONURFARMER = AttributesEnum.MmpTrainingMonUrfarmer.index();
    public static final int TBLCLUSTER = AttributesEnum.TblCluster.index();
    public static final int TBLCLUSTER1 = AttributesEnum.TblCluster1.index();
    public static final int MMPTRAININGCHECKOUT = AttributesEnum.MmpTrainingCheckOut.index();
    public static final int MMPTRAININGCHECKIN = AttributesEnum.MmpTrainingCheckIn.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmpTrainingMonInspImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.MmpTrainingMonInsp");
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
     * Gets the attribute value for StartTraining, using the alias name StartTraining.
     * @return the value of StartTraining
     */
    public Timestamp getStartTraining() {
        return (Timestamp) getAttributeInternal(STARTTRAINING);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartTraining.
     * @param value value to set the StartTraining
     */
    public void setStartTraining(Timestamp value) {
        setAttributeInternal(STARTTRAINING, value);
    }

    /**
     * Gets the attribute value for EndTraining, using the alias name EndTraining.
     * @return the value of EndTraining
     */
    public Timestamp getEndTraining() {
        return (Timestamp) getAttributeInternal(ENDTRAINING);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndTraining.
     * @param value value to set the EndTraining
     */
    public void setEndTraining(Timestamp value) {
        setAttributeInternal(ENDTRAINING, value);
    }

    /**
     * Gets the attribute value for TotTrainer, using the alias name TotTrainer.
     * @return the value of TotTrainer
     */
    public String getTotTrainer() {
        return (String) getAttributeInternal(TOTTRAINER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotTrainer.
     * @param value value to set the TotTrainer
     */
    public void setTotTrainer(String value) {
        setAttributeInternal(TOTTRAINER, value);
    }

    /**
     * Gets the attribute value for AgendaDay, using the alias name AgendaDay.
     * @return the value of AgendaDay
     */
    public String getAgendaDay() {
        return (String) getAttributeInternal(AGENDADAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for AgendaDay.
     * @param value value to set the AgendaDay
     */
    public void setAgendaDay(String value) {
        setAttributeInternal(AGENDADAY, value);
    }

    /**
     * Gets the attribute value for ReciteQuran, using the alias name ReciteQuran.
     * @return the value of ReciteQuran
     */
    public String getReciteQuran() {
        return (String) getAttributeInternal(RECITEQURAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReciteQuran.
     * @param value value to set the ReciteQuran
     */
    public void setReciteQuran(String value) {
        setAttributeInternal(RECITEQURAN, value);
    }

    /**
     * Gets the attribute value for PlanModule, using the alias name PlanModule.
     * @return the value of PlanModule
     */
    public String getPlanModule() {
        return (String) getAttributeInternal(PLANMODULE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PlanModule.
     * @param value value to set the PlanModule
     */
    public void setPlanModule(String value) {
        setAttributeInternal(PLANMODULE, value);
    }

    /**
     * Gets the attribute value for EcoSystem, using the alias name EcoSystem.
     * @return the value of EcoSystem
     */
    public String getEcoSystem() {
        return (String) getAttributeInternal(ECOSYSTEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for EcoSystem.
     * @param value value to set the EcoSystem
     */
    public void setEcoSystem(String value) {
        setAttributeInternal(ECOSYSTEM, value);
    }

    /**
     * Gets the attribute value for RevLastTraining, using the alias name RevLastTraining.
     * @return the value of RevLastTraining
     */
    public String getRevLastTraining() {
        return (String) getAttributeInternal(REVLASTTRAINING);
    }

    /**
     * Sets <code>value</code> as the attribute value for RevLastTraining.
     * @param value value to set the RevLastTraining
     */
    public void setRevLastTraining(String value) {
        setAttributeInternal(REVLASTTRAINING, value);
    }

    /**
     * Gets the attribute value for QASess, using the alias name QASess.
     * @return the value of QASess
     */
    public String getQASess() {
        return (String) getAttributeInternal(QASESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for QASess.
     * @param value value to set the QASess
     */
    public void setQASess(String value) {
        setAttributeInternal(QASESS, value);
    }

    /**
     * Gets the attribute value for SummDay, using the alias name SummDay.
     * @return the value of SummDay
     */
    public String getSummDay() {
        return (String) getAttributeInternal(SUMMDAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SummDay.
     * @param value value to set the SummDay
     */
    public void setSummDay(String value) {
        setAttributeInternal(SUMMDAY, value);
    }

    /**
     * Gets the attribute value for AnyIec, using the alias name AnyIec.
     * @return the value of AnyIec
     */
    public String getAnyIec() {
        return (String) getAttributeInternal(ANYIEC);
    }

    /**
     * Sets <code>value</code> as the attribute value for AnyIec.
     * @param value value to set the AnyIec
     */
    public void setAnyIec(String value) {
        setAttributeInternal(ANYIEC, value);
    }

    /**
     * Gets the attribute value for ToolsAdopt, using the alias name ToolsAdopt.
     * @return the value of ToolsAdopt
     */
    public String getToolsAdopt() {
        return (String) getAttributeInternal(TOOLSADOPT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToolsAdopt.
     * @param value value to set the ToolsAdopt
     */
    public void setToolsAdopt(String value) {
        setAttributeInternal(TOOLSADOPT, value);
    }

    /**
     * Gets the attribute value for IssChlRec, using the alias name IssChlRec.
     * @return the value of IssChlRec
     */
    public String getIssChlRec() {
        return (String) getAttributeInternal(ISSCHLREC);
    }

    /**
     * Sets <code>value</code> as the attribute value for IssChlRec.
     * @param value value to set the IssChlRec
     */
    public void setIssChlRec(String value) {
        setAttributeInternal(ISSCHLREC, value);
    }

    /**
     * Gets the attribute value for DetailAboutOutcome, using the alias name DetailAboutOutcome.
     * @return the value of DetailAboutOutcome
     */
    public String getDetailAboutOutcome() {
        return (String) getAttributeInternal(DETAILABOUTOUTCOME);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetailAboutOutcome.
     * @param value value to set the DetailAboutOutcome
     */
    public void setDetailAboutOutcome(String value) {
        setAttributeInternal(DETAILABOUTOUTCOME, value);
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
     * Gets the attribute value for ClusterTest, using the alias name ClusterTest.
     * @return the value of ClusterTest
     */
    public String getClusterTest() {
        return (String) getAttributeInternal(CLUSTERTEST);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClusterTest.
     * @param value value to set the ClusterTest
     */
    public void setClusterTest(String value) {
        setAttributeInternal(CLUSTERTEST, value);
    }

    /**
     * Gets the attribute value for EcoSystemEt, using the alias name EcoSystemEt.
     * @return the value of EcoSystemEt
     */
    public Timestamp getEcoSystemEt() {
        return (Timestamp) getAttributeInternal(ECOSYSTEMET);
    }

    /**
     * Sets <code>value</code> as the attribute value for EcoSystemEt.
     * @param value value to set the EcoSystemEt
     */
    public void setEcoSystemEt(Timestamp value) {
        setAttributeInternal(ECOSYSTEMET, value);
    }

    /**
     * Gets the attribute value for EcoSystemSt, using the alias name EcoSystemSt.
     * @return the value of EcoSystemSt
     */
    public Timestamp getEcoSystemSt() {
        return (Timestamp) getAttributeInternal(ECOSYSTEMST);
    }

    /**
     * Sets <code>value</code> as the attribute value for EcoSystemSt.
     * @param value value to set the EcoSystemSt
     */
    public void setEcoSystemSt(Timestamp value) {
        setAttributeInternal(ECOSYSTEMST, value);
    }

    /**
     * Gets the attribute value for PlanModuleEt, using the alias name PlanModuleEt.
     * @return the value of PlanModuleEt
     */
    public Timestamp getPlanModuleEt() {
        return (Timestamp) getAttributeInternal(PLANMODULEET);
    }

    /**
     * Sets <code>value</code> as the attribute value for PlanModuleEt.
     * @param value value to set the PlanModuleEt
     */
    public void setPlanModuleEt(Timestamp value) {
        setAttributeInternal(PLANMODULEET, value);
    }

    /**
     * Gets the attribute value for PlanModuleSt, using the alias name PlanModuleSt.
     * @return the value of PlanModuleSt
     */
    public Timestamp getPlanModuleSt() {
        return (Timestamp) getAttributeInternal(PLANMODULEST);
    }

    /**
     * Sets <code>value</code> as the attribute value for PlanModuleSt.
     * @param value value to set the PlanModuleSt
     */
    public void setPlanModuleSt(Timestamp value) {
        setAttributeInternal(PLANMODULEST, value);
    }

    /**
     * Gets the attribute value for QASessEt, using the alias name QASessEt.
     * @return the value of QASessEt
     */
    public Timestamp getQASessEt() {
        return (Timestamp) getAttributeInternal(QASESSET);
    }

    /**
     * Sets <code>value</code> as the attribute value for QASessEt.
     * @param value value to set the QASessEt
     */
    public void setQASessEt(Timestamp value) {
        setAttributeInternal(QASESSET, value);
    }

    /**
     * Gets the attribute value for QASessSt, using the alias name QASessSt.
     * @return the value of QASessSt
     */
    public Timestamp getQASessSt() {
        return (Timestamp) getAttributeInternal(QASESSST);
    }

    /**
     * Sets <code>value</code> as the attribute value for QASessSt.
     * @param value value to set the QASessSt
     */
    public void setQASessSt(Timestamp value) {
        setAttributeInternal(QASESSST, value);
    }

    /**
     * Gets the attribute value for ReciteQuranEt, using the alias name ReciteQuranEt.
     * @return the value of ReciteQuranEt
     */
    public Timestamp getReciteQuranEt() {
        return (Timestamp) getAttributeInternal(RECITEQURANET);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReciteQuranEt.
     * @param value value to set the ReciteQuranEt
     */
    public void setReciteQuranEt(Timestamp value) {
        setAttributeInternal(RECITEQURANET, value);
    }

    /**
     * Gets the attribute value for ReciteQuranSt, using the alias name ReciteQuranSt.
     * @return the value of ReciteQuranSt
     */
    public Timestamp getReciteQuranSt() {
        return (Timestamp) getAttributeInternal(RECITEQURANST);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReciteQuranSt.
     * @param value value to set the ReciteQuranSt
     */
    public void setReciteQuranSt(Timestamp value) {
        setAttributeInternal(RECITEQURANST, value);
    }

    /**
     * Gets the attribute value for RevLastTrainingEt, using the alias name RevLastTrainingEt.
     * @return the value of RevLastTrainingEt
     */
    public Timestamp getRevLastTrainingEt() {
        return (Timestamp) getAttributeInternal(REVLASTTRAININGET);
    }

    /**
     * Sets <code>value</code> as the attribute value for RevLastTrainingEt.
     * @param value value to set the RevLastTrainingEt
     */
    public void setRevLastTrainingEt(Timestamp value) {
        setAttributeInternal(REVLASTTRAININGET, value);
    }

    /**
     * Gets the attribute value for RevLastTrainingSt, using the alias name RevLastTrainingSt.
     * @return the value of RevLastTrainingSt
     */
    public Timestamp getRevLastTrainingSt() {
        return (Timestamp) getAttributeInternal(REVLASTTRAININGST);
    }

    /**
     * Sets <code>value</code> as the attribute value for RevLastTrainingSt.
     * @param value value to set the RevLastTrainingSt
     */
    public void setRevLastTrainingSt(Timestamp value) {
        setAttributeInternal(REVLASTTRAININGST, value);
    }

    /**
     * Gets the attribute value for SummDayEt, using the alias name SummDayEt.
     * @return the value of SummDayEt
     */
    public Timestamp getSummDayEt() {
        return (Timestamp) getAttributeInternal(SUMMDAYET);
    }

    /**
     * Sets <code>value</code> as the attribute value for SummDayEt.
     * @param value value to set the SummDayEt
     */
    public void setSummDayEt(Timestamp value) {
        setAttributeInternal(SUMMDAYET, value);
    }

    /**
     * Gets the attribute value for SummDaySt, using the alias name SummDaySt.
     * @return the value of SummDaySt
     */
    public Timestamp getSummDaySt() {
        return (Timestamp) getAttributeInternal(SUMMDAYST);
    }

    /**
     * Sets <code>value</code> as the attribute value for SummDaySt.
     * @param value value to set the SummDaySt
     */
    public void setSummDaySt(Timestamp value) {
        setAttributeInternal(SUMMDAYST, value);
    }

    /**
     * Gets the attribute value for TrainingSon, using the alias name TrainingSon.
     * @return the value of TrainingSon
     */
    public String getTrainingSon() {
        return (String) getAttributeInternal(TRAININGSON);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrainingSon.
     * @param value value to set the TrainingSon
     */
    public void setTrainingSon(String value) {
        setAttributeInternal(TRAININGSON, value);
    }

    /**
     * Gets the attribute value for NoOfGroup, using the alias name NoOfGroup.
     * @return the value of NoOfGroup
     */
    public Number getNoOfGroup() {
        return (Number) getAttributeInternal(NOOFGROUP);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoOfGroup.
     * @param value value to set the NoOfGroup
     */
    public void setNoOfGroup(Number value) {
        setAttributeInternal(NOOFGROUP, value);
    }

    /**
     * Gets the attribute value for EsaExamPlant, using the alias name EsaExamPlant.
     * @return the value of EsaExamPlant
     */
    public String getEsaExamPlant() {
        return (String) getAttributeInternal(ESAEXAMPLANT);
    }

    /**
     * Sets <code>value</code> as the attribute value for EsaExamPlant.
     * @param value value to set the EsaExamPlant
     */
    public void setEsaExamPlant(String value) {
        setAttributeInternal(ESAEXAMPLANT, value);
    }

    /**
     * Gets the attribute value for EsaIdenDis, using the alias name EsaIdenDis.
     * @return the value of EsaIdenDis
     */
    public String getEsaIdenDis() {
        return (String) getAttributeInternal(ESAIDENDIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for EsaIdenDis.
     * @param value value to set the EsaIdenDis
     */
    public void setEsaIdenDis(String value) {
        setAttributeInternal(ESAIDENDIS, value);
    }

    /**
     * Gets the attribute value for EsaIdenVar, using the alias name EsaIdenVar.
     * @return the value of EsaIdenVar
     */
    public String getEsaIdenVar() {
        return (String) getAttributeInternal(ESAIDENVAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for EsaIdenVar.
     * @param value value to set the EsaIdenVar
     */
    public void setEsaIdenVar(String value) {
        setAttributeInternal(ESAIDENVAR, value);
    }

    /**
     * Gets the attribute value for EsaObsGen, using the alias name EsaObsGen.
     * @return the value of EsaObsGen
     */
    public String getEsaObsGen() {
        return (String) getAttributeInternal(ESAOBSGEN);
    }

    /**
     * Sets <code>value</code> as the attribute value for EsaObsGen.
     * @param value value to set the EsaObsGen
     */
    public void setEsaObsGen(String value) {
        setAttributeInternal(ESAOBSGEN, value);
    }

    /**
     * Gets the attribute value for EsaOthers, using the alias name EsaOthers.
     * @return the value of EsaOthers
     */
    public String getEsaOthers() {
        return (String) getAttributeInternal(ESAOTHERS);
    }

    /**
     * Sets <code>value</code> as the attribute value for EsaOthers.
     * @param value value to set the EsaOthers
     */
    public void setEsaOthers(String value) {
        setAttributeInternal(ESAOTHERS, value);
    }

    /**
     * Gets the attribute value for EsaStuPlant, using the alias name EsaStuPlant.
     * @return the value of EsaStuPlant
     */
    public String getEsaStuPlant() {
        return (String) getAttributeInternal(ESASTUPLANT);
    }

    /**
     * Sets <code>value</code> as the attribute value for EsaStuPlant.
     * @param value value to set the EsaStuPlant
     */
    public void setEsaStuPlant(String value) {
        setAttributeInternal(ESASTUPLANT, value);
    }

    /**
     * Gets the attribute value for IecBanner, using the alias name IecBanner.
     * @return the value of IecBanner
     */
    public String getIecBanner() {
        return (String) getAttributeInternal(IECBANNER);
    }

    /**
     * Sets <code>value</code> as the attribute value for IecBanner.
     * @param value value to set the IecBanner
     */
    public void setIecBanner(String value) {
        setAttributeInternal(IECBANNER, value);
    }

    /**
     * Gets the attribute value for IecBroch, using the alias name IecBroch.
     * @return the value of IecBroch
     */
    public String getIecBroch() {
        return (String) getAttributeInternal(IECBROCH);
    }

    /**
     * Sets <code>value</code> as the attribute value for IecBroch.
     * @param value value to set the IecBroch
     */
    public void setIecBroch(String value) {
        setAttributeInternal(IECBROCH, value);
    }

    /**
     * Gets the attribute value for IecCards, using the alias name IecCards.
     * @return the value of IecCards
     */
    public String getIecCards() {
        return (String) getAttributeInternal(IECCARDS);
    }

    /**
     * Sets <code>value</code> as the attribute value for IecCards.
     * @param value value to set the IecCards
     */
    public void setIecCards(String value) {
        setAttributeInternal(IECCARDS, value);
    }

    /**
     * Gets the attribute value for IecInform, using the alias name IecInform.
     * @return the value of IecInform
     */
    public String getIecInform() {
        return (String) getAttributeInternal(IECINFORM);
    }

    /**
     * Sets <code>value</code> as the attribute value for IecInform.
     * @param value value to set the IecInform
     */
    public void setIecInform(String value) {
        setAttributeInternal(IECINFORM, value);
    }

    /**
     * Gets the attribute value for IecNill, using the alias name IecNill.
     * @return the value of IecNill
     */
    public String getIecNill() {
        return (String) getAttributeInternal(IECNILL);
    }

    /**
     * Sets <code>value</code> as the attribute value for IecNill.
     * @param value value to set the IecNill
     */
    public void setIecNill(String value) {
        setAttributeInternal(IECNILL, value);
    }

    /**
     * Gets the attribute value for IecPamp, using the alias name IecPamp.
     * @return the value of IecPamp
     */
    public String getIecPamp() {
        return (String) getAttributeInternal(IECPAMP);
    }

    /**
     * Sets <code>value</code> as the attribute value for IecPamp.
     * @param value value to set the IecPamp
     */
    public void setIecPamp(String value) {
        setAttributeInternal(IECPAMP, value);
    }

    /**
     * Gets the attribute value for ToolsDemo, using the alias name ToolsDemo.
     * @return the value of ToolsDemo
     */
    public String getToolsDemo() {
        return (String) getAttributeInternal(TOOLSDEMO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToolsDemo.
     * @param value value to set the ToolsDemo
     */
    public void setToolsDemo(String value) {
        setAttributeInternal(TOOLSDEMO, value);
    }

    /**
     * Gets the attribute value for ToolsDiscus, using the alias name ToolsDiscus.
     * @return the value of ToolsDiscus
     */
    public String getToolsDiscus() {
        return (String) getAttributeInternal(TOOLSDISCUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToolsDiscus.
     * @param value value to set the ToolsDiscus
     */
    public void setToolsDiscus(String value) {
        setAttributeInternal(TOOLSDISCUS, value);
    }

    /**
     * Gets the attribute value for ToolsGroup, using the alias name ToolsGroup.
     * @return the value of ToolsGroup
     */
    public String getToolsGroup() {
        return (String) getAttributeInternal(TOOLSGROUP);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToolsGroup.
     * @param value value to set the ToolsGroup
     */
    public void setToolsGroup(String value) {
        setAttributeInternal(TOOLSGROUP, value);
    }

    /**
     * Gets the attribute value for ToolsLecture, using the alias name ToolsLecture.
     * @return the value of ToolsLecture
     */
    public String getToolsLecture() {
        return (String) getAttributeInternal(TOOLSLECTURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToolsLecture.
     * @param value value to set the ToolsLecture
     */
    public void setToolsLecture(String value) {
        setAttributeInternal(TOOLSLECTURE, value);
    }

    /**
     * Gets the attribute value for ToolsOthers, using the alias name ToolsOthers.
     * @return the value of ToolsOthers
     */
    public String getToolsOthers() {
        return (String) getAttributeInternal(TOOLSOTHERS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToolsOthers.
     * @param value value to set the ToolsOthers
     */
    public void setToolsOthers(String value) {
        setAttributeInternal(TOOLSOTHERS, value);
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
     * Gets the attribute value for MmpTrainingCheckInId, using the alias name MmpTrainingCheckInId.
     * @return the value of MmpTrainingCheckInId
     */
    public BigDecimal getMmpTrainingCheckInId() {
        return (BigDecimal) getAttributeInternal(MMPTRAININGCHECKINID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MmpTrainingCheckInId.
     * @param value value to set the MmpTrainingCheckInId
     */
    public void setMmpTrainingCheckInId(BigDecimal value) {
        setAttributeInternal(MMPTRAININGCHECKINID, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMmpTrainingMonFarmer() {
        return (RowIterator) getAttributeInternal(MMPTRAININGMONFARMER);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMmpTrainingMonTopics() {
        return (RowIterator) getAttributeInternal(MMPTRAININGMONTOPICS);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMmpTrainingMonUrfarmer() {
        return (RowIterator) getAttributeInternal(MMPTRAININGMONURFARMER);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblCluster1() {
        return (RowIterator) getAttributeInternal(TBLCLUSTER1);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMmpTrainingCheckOut() {
        return (RowIterator) getAttributeInternal(MMPTRAININGCHECKOUT);
    }


    /**
     * @return the associated entity MmpTrainingCheckInImpl.
     */
    public MmpTrainingCheckInImpl getMmpTrainingCheckIn() {
        return (MmpTrainingCheckInImpl) getAttributeInternal(MMPTRAININGCHECKIN);
    }

    /**
     * Sets <code>value</code> as the associated entity MmpTrainingCheckInImpl.
     */
    public void setMmpTrainingCheckIn(MmpTrainingCheckInImpl value) {
        setAttributeInternal(MMPTRAININGCHECKIN, value);
    }


    /**
     * @param mmpTrainingMonInspId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal mmpTrainingMonInspId) {
        return new Key(new Object[] { mmpTrainingMonInspId });
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

