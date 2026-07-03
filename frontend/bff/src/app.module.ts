import { Module } from '@nestjs/common';

/**
 * BFF 模块规划（对应业务域, 每域一个聚合模块）:
 * - marketing.module  D1: 税优计算/分享
 * - user.module       D2: 注册/实名/开户/消息
 * - advisor.module    D3: 风测/方案
 * - product.module    D4: 货架/详情/对比
 * - trade.module      D5: 申购/赎回/持仓
 * - content.module    D6: 知识库/模拟器
 * 职责: 聚合/裁剪/端差异编排; 不承载业务规则（业务规则在各域服务）。
 */
@Module({
  imports: [],
})
export class AppModule {}
