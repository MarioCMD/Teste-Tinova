import express from 'express';
import bodyParser from 'body-parser';
import veiculosRoutes from './routes/veiculos.js';

const app = express();
const PORT = 5000;

app.use(bodyParser.json());

app.use('/veiculos', veiculosRoutes);

app.get('/', (req, res) => res.send("home page"));

app.listen(PORT, () => console.log(`Server running on port: http://localhost:${PORT}`));
