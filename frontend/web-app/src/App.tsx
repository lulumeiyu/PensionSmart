/**
 * 页面模块与业务域对应（docs/architecture/00 §2）:
 * - features/tax-calc     D1 税优计算器 H5（核心获客入口）
 * - features/onboarding   D2 注册/实名/开户
 * - features/advisor      D3 风险测评/方案推荐
 * - features/products     D4 货架/详情/对比
 * - features/trade        D5 申购/持仓/定投
 * - features/learn        D6 知识库/退休金模拟器
 */
export default function App() {
  return (
    <main>
      <h1>PensionSmart · 个人养老金智能投顾平台</h1>
      <p>前端脚手架：功能模块见 src/features/*（对应各业务域）。</p>
    </main>
  );
}
