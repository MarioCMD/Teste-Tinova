import express from 'express';
import { v4 as uuidv4} from 'uuid';

const router = express.Router();

var veiculos = [
];

router.get('/', (req, ress) =>{
    ress.send(veiculos);
});

router.post('/', (req, ress) =>{
    const veiculo = req.body;
    veiculos.push({...veiculo, id: uuidv4() });
    ress.send('Veiculo adicionado');
}
)

router.get('/:id', (req, ress) =>{
    const { id } = req.params;
    const foundVeiculo = veiculos.find((veiculo) => veiculo.id == id);
    ress.send(foundVeiculo);
})

router.delete('/:id', (req, ress) => {
    const { id } = req.params;

    veiculos = veiculos.filter((veiculo) => veiculo.id != id);
    ress.send('Veiculo deletado');
})

router.patch('/:id', (req, ress) =>{
    const { id } = req.params;
    const {veiculo, marca, ano, descricao, vendido } = req.body;
    const foundVeiculo = veiculos.find((veiculo) => veiculo.id == id);

    if(veiculo){
        foundVeiculo.veiculo = veiculo;
    }

    if(marca){
        foundVeiculo.marca = marca;
    }

    if(descricao){
        foundVeiculo.descricao = descricao;
    }

    if(ano){
        foundVeiculo.ano = ano;
    }

    if(vendido){
        foundVeiculo.vendido = vendido;
    }

    ress.send('Veiculo alterado');
}
)

router.put('/:id', (req, ress) =>{
    const { id } = req.params;
    const newVeiculo = req.body;
    const foundVeiculo = veiculos.find((veiculo) => veiculo.id == id);
    foundVeiculo.veiculo = newVeiculo.veiculo;
    foundVeiculo.marca = newVeiculo.marca;
    foundVeiculo.ano = newVeiculo.ano;
    foundVeiculo.descricao = newVeiculo.descricao;
    foundVeiculo.vendido = newVeiculo.vendido;
    ress.send('Veiculo alterado');
}
)

export default router;