package com.pensionsmart.commons.event;

/**
 * 核心跨域领域事件目录（docs/architecture/00 §3.3）。
 * 新增事件须在此登记并同步 contracts/proto/events。
 */
public final class EventTypes {

    // D2 用户管理域
    public static final String USER_REGISTERED = "user.UserRegistered";
    public static final String REAL_NAME_VERIFIED = "user.RealNameVerified";
    public static final String PENSION_ACCOUNT_OPENED = "account.PensionAccountOpened";

    // D3 投顾引擎域
    public static final String RISK_ASSESSMENT_COMPLETED = "advisor.RiskAssessmentCompleted";
    public static final String ALLOCATION_RECOMMENDED = "advisor.AllocationRecommended";
    public static final String REBALANCE_SUGGESTION_GENERATED = "advisor.RebalanceSuggestionGenerated";

    // D5 交易结算域
    public static final String FIRST_PURCHASE_COMPLETED = "trade.FirstPurchaseCompleted";
    public static final String PORTFOLIO_UPDATED = "trade.PortfolioUpdated";
    public static final String REBALANCE_EXECUTED = "trade.RebalanceExecuted";

    // D1 营销获客域
    public static final String TAX_CALCULATOR_USED = "marketing.TaxCalculatorUsed";
    public static final String REACH_DELIVERED = "marketing.ReachDelivered";

    // S1 数据中台域
    public static final String MARKET_VOLATILITY_DETECTED = "market.VolatilityDetected";
    public static final String PROFILE_UPDATED = "data.ProfileUpdated";

    private EventTypes() {
    }
}
