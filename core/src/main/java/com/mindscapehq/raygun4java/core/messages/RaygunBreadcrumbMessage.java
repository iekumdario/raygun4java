package com.mindscapehq.raygun4java.core.messages;

import java.util.Map;
import java.util.WeakHashMap;

public class RaygunBreadcrumbMessage {
    private String message;
    private String category;
    private int level = RaygunBreadcrumbLevel.INFO.ordinal();
    private String type = "Manual";
    private Map<String, Object> customData = new WeakHashMap<String, Object>();
    private Long timestamp = System.currentTimeMillis();
    private String className;
    private String methodName;
    private Integer lineNumber;

    public String getMessage() {
        return message;
    }

    public RaygunBreadcrumbMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public RaygunBreadcrumbMessage withCategory(String category) {
        this.category = category;
        return this;
    }

    public RaygunBreadcrumbLevel getLevel() {
        return RaygunBreadcrumbLevel.values()[level];
    }

    public RaygunBreadcrumbMessage withLevel(RaygunBreadcrumbLevel level) {
        this.level = level.ordinal();
        return this;
    }

    public Map<String, Object> getCustomData() {
        return customData;
    }

    public RaygunBreadcrumbMessage withCustomData(Map<String, Object> customData) {
        this.customData = customData;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public RaygunBreadcrumbMessage withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public RaygunBreadcrumbMessage withClassName(String className) {
        this.className = className;
        return this;
    }

    public String getMethodName() {
        return methodName;
    }

    public RaygunBreadcrumbMessage withMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public RaygunBreadcrumbMessage withLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }
}
