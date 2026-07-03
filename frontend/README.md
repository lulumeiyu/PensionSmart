# frontend · 前后端分离

| 目录 | 说明 | 端口 |
|------|------|------|
| `web-app/` | React 18 + TS + Vite（Web/H5），页面模块按业务域组织于 `src/features/*` | 5173 (dev) |
| `bff/` | NestJS BFF 聚合层：前端唯一入口，聚合/裁剪各域数据，经 API 网关调用后端 | 3100 |
| `prototype/` | UI 原型（Figma Make 导出，React+Vite+Tailwind+shadcn/ui），作为 `web-app` 的视觉/交互参考 | — |

调用链：`React → BFF(3100) → API 网关 → 各域微服务`（docs/architecture/00 §2.2/§2.4）。
