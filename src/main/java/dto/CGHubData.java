package dto;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/** Class has all the fields to be inserted into database
 */

public class CGHubData {
    String analysisId;
    String barcode;
    Date lastModified;
    String center;
    String study;
    String bamName;
    String bamPath;
    String bamChecksum;
    String bamUrl;
    int bamSize;
    String baiName;
    String baiPath;
    String baiChecksum;
    int baiSize;
    String fastqName;
    String fastqPath;
    String fastqChecksum;
    String fastqUrl;
    int fastqSize;
    String disease;
    String diseaseAbbr;
    String sampleId;
    String sampleType;
    String libraryType;
    String platform;
    String bamFastq;

    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String value) {
        analysisId = value;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String value) {
        barcode = value;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(String value) {
                try {
                    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = formatter.parse(value);
                    lastModified = date;
                }
                catch(ParseException e) {
                    System.out.println("ERROR: could not parse date in string \"" + value + "\"");
                }
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String value) {
        center = value;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String value) {
        study = value;
    }

    public String getBamName() {
        return bamName;
    }

    public void setBamName(String value) {
        bamName = value;
    }

    public String getBamPath() {
        return bamPath;
    }

    public void setBamPath(String value) {
        bamPath = value;
    }

    public String getBamChecksum() {
        return bamChecksum;
    }

    public void setBamChecksum(String value) {
        bamChecksum = value;
    }

    public String getBamUrl() {
        return bamUrl;
    }

    public void setBamUrl(String value) {
        bamUrl = value;
    }


    public int getBamSize() {
        return bamSize;
    }

    public void setBamSize(int value) {
        bamSize = value;
    }

    public String getBaiName() {
        return baiName;
    }
    public void setBaiName(String value) {
        baiName = value;
    }

    public String getBaiPath() {
        return baiPath;
    }

    public void setBaiPath(String value) {
        baiPath = value;
    }

    public String getBaiChecksum() {
        return baiChecksum;
    }

    public void setBaiChecksum(String value) {
        baiChecksum = value;
    }

    public int getBaiSize() {
        return baiSize;
    }

    public void setBaiSize(int value) {
        baiSize = value;
    }

    public String getFastqName() {
        return fastqName;
    }

    public void setFastqName(String value) {
        fastqName = value;
    }

    public String getFastqPath() {
        return fastqPath;
    }

    public void setFastqPath(String value) {
        fastqPath = value;
    }

    public String getFastqChecksum() {
        return fastqChecksum;
    }

    public void setFastqChecksum(String value) {
        fastqChecksum = value;
    }

    public String getFastqUrl() {
        return fastqUrl;
    }

    public void setFastqUrl(String value) {
        fastqUrl = value;
    }

    public int getFastqSize() {
        return fastqSize;
    }

    public void setFastqSize(int value) {
        fastqSize = value;
    }

    public String getDisease() {
        return disease;
    }

    public String getDiseaseAbbr() {
        return diseaseAbbr;
    }

// set both disease and diseaseAbbr
    public void setDisease(String value) {
    	diseaseAbbr = value;
    	switch (diseaseAbbr) {
    		case "BLCA": disease = "Bladder Urothelial Carcinoma";
    			break;
            case "BRCA": disease = "Breast invasive carcinoma";
            	break;
            case "CESC": disease = "Cervical squamous cell carcinoma and endocervical adenocarcinoma";
            	break;
            case "COAD": disease = "Colon adenocarcinoma";
            	break;
            case "DLBC": disease = "Lymphoid Neoplasm Diffuse Large B-cell Lymphoma";
            	break;
            case "GBM":  disease = "Glioblastoma multiforme";
            	break;
            case "HNSC": disease = "Head and Neck squamous cell carcinoma";
            	break;
            case "KICH": disease = "Kidney Chromophobe";
            	break;
            case "KIRC": disease = "Kidney renal clear cell carcinoma";
            	break;
            case "KIRP": disease = "Kidney renal papillary cell carcinoma";
            	break;
            case "LAML": disease = "Acute Myeloid Leukemia";
            	break;
            case "LGG":  disease = "Brain Lower Grade Glioma";
            	break;
            case "LIHC": disease = "Liver hepatocellular carcinoma";
            	break;
            case "LUAD": disease = "Lung adenocarcinoma";
            	break;
            case "LUSC": disease = "Lung squamous cell carcinoma";
            	break;
            case "OV":   disease = "Ovarian serous cystadenocarcinoma";
            	break;
            case "PAAD": disease = "Pancreatic adenocarcinoma";
            	break;
            case "PRAD": disease = "Prostate adenocarcinoma";
            	break;
            case "READ": disease = "Rectum adenocarcinoma";
            	break;
            case "SARC": disease = "Sarcoma";
            	break;
            case "SKCM": disease = "Skin Cutaneous Melanoma";
            	break;
            case "STAD": disease = "Stomach adenocarcinoma";
            	break;
            case "THCA": disease = "Thyroid carcinoma";
            	break;
            case "UCEC": disease = "Uterine Corpus Endometrioid Carcinoma";
            	break;
    	}
    }
    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String value) {
        sampleId = value;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String value) {
        sampleType = value;
    }

    public String getLibraryType() {
        return libraryType;
    }

    public void setLibraryType(String value) {
        libraryType = value;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String value) {
        platform = value;
    }

    public String getBamFastq() {
        return bamFastq;
    }

    public void setBamFastq(String value) {
        bamFastq = value;
    }

}
