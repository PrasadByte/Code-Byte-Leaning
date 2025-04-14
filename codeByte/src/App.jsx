import { Routes, Route, } from 'react-router-dom';
import './App.css';
import Navbar from './component/Navbar';
import Home from './component/Home';

function App() {
  return (
  
      <Routes>
        <Route path="/" element={<Navbar />} />
        <Route path="/" element={<Home />} />
      </Routes>
 
  );
}

export default App;
