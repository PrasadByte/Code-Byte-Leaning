import React from 'react'
import '../styles/Home.css'

export default function Home() {
  return (
    <div className="home-container">
      <h1>Hello, what do You Want To Learn?</h1>
      <div className="input-group">
        <input type="text" class="form-control" placeholder="Recipient's username" aria-label="Recipient's username with two button addons" />
        <button className="btn btn-outline-secondary" type="button">Button</button>
      </div>

    </div>


  )
}
