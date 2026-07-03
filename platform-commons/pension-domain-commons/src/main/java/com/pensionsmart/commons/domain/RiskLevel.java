package com.pensionsmart.commons.domain;

/**
 * 用户风险等级 C1~C5, 全域统一（HRS v1.0 D3.1）。
 * 与产品风险等级 {@link ProductRiskLevel} 映射用于适当性校验。
 */
public enum RiskLevel {
    C1, // 保守
    C2, // 稳健
    C3, // 平衡
    C4, // 积极
    C5; // 进取

    /** 适当性判定: 产品风险等级不得超过用户风险等级 (NFR-09)。 */
    public boolean accepts(ProductRiskLevel productRiskLevel) {
        return productRiskLevel.ordinal() <= this.ordinal();
    }
}
