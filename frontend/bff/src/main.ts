import { NestFactory } from '@nestjs/core';
import { AppModule } from './app.module';

const PORT = 3100;

async function bootstrap(): Promise<void> {
  const app = await NestFactory.create(AppModule);
  app.setGlobalPrefix('api/v1');
  await app.listen(PORT);
}

bootstrap();
