import { defineConfig } from 'vite';
import legacy from '@vitejs/plugin-legacy';

export default defineConfig({
  root: 'Frontend', // where your index.html lives
  build: {
    outDir: '../www', // build output path
    emptyOutDir: true,
  },
  plugins: [legacy()],
});

