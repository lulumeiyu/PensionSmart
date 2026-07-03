import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';

// 本地开发: /api 代理到 BFF (3100)
export default defineConfig({
  plugins: [react()],
  server: {
    port: 5173,
    proxy: {
      '/api': { target: 'http://localhost:3100', changeOrigin: true },
    },
  },
});
